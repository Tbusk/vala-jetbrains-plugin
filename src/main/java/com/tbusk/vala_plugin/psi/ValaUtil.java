package com.tbusk.vala_plugin.psi;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.tbusk.vala_plugin.language.ValaFile;
import com.tbusk.vala_plugin.language.ValaFileType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ValaUtil {

    public static List<ValaIdentifier> findIdentifiers(Project project, String name) {
        List<ValaIdentifier> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(
                ValaFileType.INSTANCE,
                GlobalSearchScope.allScope(project)
        );

        for (VirtualFile virtualFile : virtualFiles) {
            ValaFile valaFile = (ValaFile) PsiManager.getInstance(project).findFile(virtualFile);

            if (valaFile != null) {
                ValaIdentifier[] identifiers = PsiTreeUtil.getChildrenOfType(valaFile, ValaIdentifier.class);

                if (identifiers != null) {

                    for (ValaIdentifier identifier : identifiers) {
                        if (name.equals(identifier.getName())) {
                            result.add(identifier);
                        }
                    }
                }
            }
        }

        return result;
    }

    public static List<ValaIdentifier> findIdentifiers(Project project) {
        List<ValaIdentifier> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(
                ValaFileType.INSTANCE,
                GlobalSearchScope.allScope(project)
        );

        for (VirtualFile virtualFile : virtualFiles) {
            ValaFile valaFile = (ValaFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (valaFile != null) {
                ValaIdentifier[] identifiers = PsiTreeUtil.getChildrenOfType(valaFile, ValaIdentifier.class);

                if (identifiers != null) {
                    Collections.addAll(result, identifiers);
                }
            }
        }

        return result;
    }

    public static List<PsiNamedElement> findDeclarations(Project project, String name) {
        List<PsiNamedElement> results = new ArrayList<>();

        Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(
                ValaFileType.INSTANCE,
                GlobalSearchScope.allScope(project)
        );

        for (VirtualFile virtualFile : virtualFiles) {
            ValaFile valaFile = (ValaFile) PsiManager.getInstance(project).findFile(virtualFile);

            if (valaFile != null) {

                Collection<ValaClassDeclaration> classDeclarations = PsiTreeUtil.findChildrenOfType(valaFile, ValaClassDeclaration.class);
                classDeclarations.forEach(declaration -> {
                    if (name.equals(declaration.getName())) {
                        results.add(declaration);
                    }
                });

                Collection<ValaFieldDeclaration> fieldDeclarations = PsiTreeUtil.findChildrenOfType(valaFile, ValaFieldDeclaration.class);
                fieldDeclarations.forEach(declaration -> {
                    if (name.equals(declaration.getName())) {
                        results.add(declaration);
                    }
                });

                Collection<ValaConstantDeclaration> constantDeclarations = PsiTreeUtil.findChildrenOfType(valaFile, ValaConstantDeclaration.class);
                constantDeclarations.forEach(declaration -> {
                    if (name.equals(declaration.getName())) {
                        results.add(declaration);
                    }
                });

                Collection<ValaMethodDeclaration> methodDeclarations = PsiTreeUtil.findChildrenOfType(valaFile, ValaMethodDeclaration.class);
                methodDeclarations.forEach(declaration -> {
                    if (name.equals(declaration.getName())) {
                        results.add(declaration);
                    }
                });

                Collection<ValaSignalDeclaration> signalDeclarations = PsiTreeUtil.findChildrenOfType(valaFile, ValaSignalDeclaration.class);
                signalDeclarations.forEach(declaration -> {
                    if (name.equals(declaration.getName())) {
                        results.add(declaration);
                    }
                });

                Collection<ValaStructDeclaration> structDeclarations = PsiTreeUtil.findChildrenOfType(valaFile, ValaStructDeclaration.class);
                structDeclarations.forEach(declaration -> {
                    if (name.equals(declaration.getName())) {
                        results.add(declaration);
                    }
                });

                Collection<ValaEnumDeclaration> enumDeclarations = PsiTreeUtil.findChildrenOfType(valaFile, ValaEnumDeclaration.class);
                enumDeclarations.forEach(declaration -> {
                    if (name.equals(declaration.getName())) {
                        results.add(declaration);
                    }
                });

                Collection<ValaInterfaceDeclaration> interfaceDeclarations = PsiTreeUtil.findChildrenOfType(valaFile, ValaInterfaceDeclaration.class);
                interfaceDeclarations.forEach(declaration -> {
                    if (name.equals(declaration.getName())) {
                        results.add(declaration);
                    }
                });

                Collection<ValaErrordomainDeclaration> errordomainDeclarations = PsiTreeUtil.findChildrenOfType(valaFile, ValaErrordomainDeclaration.class);
                errordomainDeclarations.forEach(declaration -> {
                    if (name.equals(declaration.getName())) {
                        results.add(declaration);
                    }
                });
            }
        }

        return results;
    }
}

