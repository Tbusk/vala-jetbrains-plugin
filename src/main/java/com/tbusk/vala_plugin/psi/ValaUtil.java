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

import java.util.*;

public class ValaUtil {

    public static List<PsiNamedElement> findDeclarationsInFile(ValaFile file, String name, boolean projectScope) {
        Set<PsiNamedElement> results = new HashSet<>();

        if (projectScope) {
            Project project = file.getProject();
            Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(
                    ValaFileType.INSTANCE,
                    GlobalSearchScope.allScope(project)
            );
            for (VirtualFile virtualFile : virtualFiles) {
                ValaFile valaFile = (ValaFile) PsiManager.getInstance(project).findFile(virtualFile);
                if (valaFile != null) {
                    results.addAll(findDeclarationsInFile(valaFile, name, false));
                }
            }
            return new ArrayList<>(results);
        }

        if (file == null) return new ArrayList<>(results);

        if (name == null || name.isEmpty()) {
            // Return all named elements
            results.addAll(PsiTreeUtil.collectElementsOfType(file, ValaClassDeclaration.class));
            results.addAll(PsiTreeUtil.collectElementsOfType(file, ValaFieldDeclaration.class));
            results.addAll(PsiTreeUtil.collectElementsOfType(file, ValaConstantDeclaration.class));
            results.addAll(PsiTreeUtil.collectElementsOfType(file, ValaStructDeclaration.class));
            results.addAll(PsiTreeUtil.collectElementsOfType(file, ValaEnumDeclaration.class));
            results.addAll(PsiTreeUtil.collectElementsOfType(file, ValaInterfaceDeclaration.class));
            results.addAll(PsiTreeUtil.collectElementsOfType(file, ValaErrordomainDeclaration.class));
            results.addAll(PsiTreeUtil.collectElementsOfType(file, ValaLocalVariable.class));
            results.addAll(PsiTreeUtil.collectElementsOfType(file, ValaLocalTupleDeclaration.class));
            results.addAll(PsiTreeUtil.collectElementsOfType(file, ValaPropertyDeclaration.class));
            results.addAll(PsiTreeUtil.collectElementsOfType(file, ValaParameter.class));
            results.addAll(PsiTreeUtil.collectElementsOfType(file, ValaCatchClause.class));
            results.addAll(PsiTreeUtil.collectElementsOfType(file, ValaDestructorDeclaration.class));
            return new ArrayList<>(results);
        }

        Collection<ValaClassDeclaration> classDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaClassDeclaration.class);
        classDeclarations.forEach(declaration -> {
            String declName = declaration.getName();
            if (name.equals(declName)) {
                results.add(declaration);
            }
        });

        Collection<ValaFieldDeclaration> fieldDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaFieldDeclaration.class);
        fieldDeclarations.forEach(declaration -> {
            String declName = declaration.getName();
            if (name.equals(declName)) {
                results.add(declaration);
            }
        });

        Collection<ValaConstantDeclaration> constantDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaConstantDeclaration.class);
        constantDeclarations.forEach(declaration -> {
            String declName = declaration.getName();
            if (name.equals(declName)) {
                results.add(declaration);
            }
        });

        Collection<ValaStructDeclaration> structDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaStructDeclaration.class);
        structDeclarations.forEach(declaration -> {
            String declName = declaration.getName();
            if (name.equals(declName)) {
                results.add(declaration);
            }
        });

        Collection<ValaEnumDeclaration> enumDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaEnumDeclaration.class);
        enumDeclarations.forEach(declaration -> {
            String declName = declaration.getName();
            if (name.equals(declName)) {
                results.add(declaration);
            }
        });

        Collection<ValaInterfaceDeclaration> interfaceDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaInterfaceDeclaration.class);
        interfaceDeclarations.forEach(declaration -> {
            String declName = declaration.getName();
            if (name.equals(declName)) {
                results.add(declaration);
            }
        });

        Collection<ValaErrordomainDeclaration> errordomainDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaErrordomainDeclaration.class);
        errordomainDeclarations.forEach(declaration -> {
            String declName = declaration.getName();
            if (name.equals(declName)) {
                results.add(declaration);
            }
        });

        Collection<ValaLocalVariable> localVariables = PsiTreeUtil.collectElementsOfType(file, ValaLocalVariable.class);
        localVariables.forEach(declaration -> {
            String declName = declaration.getName();
            if (name.equals(declName)) {
                results.add(declaration);
            }
        });

        Collection<ValaLocalTupleDeclaration> localTupleDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaLocalTupleDeclaration.class);
        localTupleDeclarations.forEach(declaration -> {
            String declName = declaration.getName();
            if (name.equals(declName)) {
                results.add(declaration);
            }
        });

        Collection<ValaPropertyDeclaration> propertyDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaPropertyDeclaration.class);
        propertyDeclarations.forEach(declaration -> {
            String declName = declaration.getName();
            if (name.equals(declName)) {
                results.add(declaration);
            }
        });

        // Parameters
        Collection<ValaParameter> parameterDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaParameter.class);
        parameterDeclarations.forEach(declaration -> {
            String declName = declaration.getName();
            if (name.equals(declName)) {
                results.add(declaration);
            }
        });

        // Foreach
        Collection<ValaForeachStatement> foreachDeclaration = PsiTreeUtil.collectElementsOfType(file, ValaForeachStatement.class);
        foreachDeclaration.forEach(declaration -> {
            String declName = declaration.getName();
            if (name.equals(declName)) {
                results.add(declaration);
            }
        });

        // Catch Clause
        Collection<ValaCatchClause> catchDeclaration = PsiTreeUtil.collectElementsOfType(file, ValaCatchClause.class);
        catchDeclaration.forEach(declaration -> {
            String declName = declaration.getName();
            if (name.equals(declName)) {
                results.add(declaration);
            }
        });

        // Catch Clause
        Collection<ValaLocalTupleDeclaration> tupleDeclaration = PsiTreeUtil.collectElementsOfType(file, ValaLocalTupleDeclaration.class);
        tupleDeclaration.forEach(declaration -> {
            String declName = declaration.getName();
            if (name.equals(declName)) {
                results.add(declaration);
            }
        });

        // Destructor Declaration
        Collection<ValaDestructorDeclaration> destructorDeclaration = PsiTreeUtil.collectElementsOfType(file, ValaDestructorDeclaration.class);
        destructorDeclaration.forEach(declaration -> {
            String declName = declaration.getName();
            if (name.equals(declName)) {
                results.add(declaration);
            }
        });

        return new ArrayList<>(results);
    }
}

