package com.tbusk.vala_plugin.psi;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.tbusk.vala_plugin.language.ValaFile;
import com.tbusk.vala_plugin.language.ValaFileType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ValaUtil {

    public static List<PsiNamedElement> findDeclarationsInFile(ValaFile file, String name, boolean projectScope) {
        List<PsiNamedElement> results = new ArrayList<>();

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
            return results;
        }

        if (file == null) return results;

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
            return results.stream().distinct().collect(Collectors.toList());
        }

        System.err.println("Searching file: " + file.getName());

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

        return results;
    }

    public static List<PsiNamedElement> findAllDeclarationsInFile(ValaFile file, boolean projectScope) {
        List<PsiNamedElement> results = new ArrayList<>();

        if (projectScope) {
            Project project = file.getProject();
            Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(
                    ValaFileType.INSTANCE,
                    GlobalSearchScope.allScope(project)
            );
            for (VirtualFile virtualFile : virtualFiles) {
                ValaFile valaFile = (ValaFile) PsiManager.getInstance(project).findFile(virtualFile);
                if (valaFile != null) {
                    results.addAll(findAllDeclarationsInFile(valaFile, true));
                }
            }
            return results;
        }

        if (file == null) return results;

        // Collect all the same types as above
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

        return results;
    }

    public static List<PsiNamedElement> findDeclarationsInScope(PsiElement context, String qualifiedName) {
        if (qualifiedName == null || qualifiedName.isEmpty()) {
            // All in scope - collect all visible
            List<PsiNamedElement> all = new ArrayList<>();
            // Local scope
            PsiElement current = context;
            while (current != null) {
                if (current instanceof ValaBlock) {
                    all.addAll(PsiTreeUtil.collectElementsOfType(current, ValaLocalVariable.class));
                    all.addAll(PsiTreeUtil.collectElementsOfType(current, ValaLocalTupleDeclaration.class));
                }
                current = current.getParent();
            }
            // Method params
            ValaMethodDeclaration method = PsiTreeUtil.getParentOfType(context, ValaMethodDeclaration.class);
            if (method != null) {
                ValaParameters params = method.getParameters();
                if (params != null) {
                    all.addAll(params.getParameterList());
                }
            }
            // Class members
            PsiElement classScope = PsiTreeUtil.getParentOfType(context, ValaClassDeclaration.class);
            if (classScope != null) {
                ValaFile file = (ValaFile) classScope.getContainingFile();
                all.addAll(findDeclarationsInFile(file, "", false));  // "" for all
            }
            // Global
            ValaFile file = PsiTreeUtil.getParentOfType(context, ValaFile.class);
            if (file != null) {
                all.addAll(findDeclarationsInFile(file, "", false));
            }
            return all.stream().distinct().collect(Collectors.toList());
        }

        List<PsiNamedElement> results = new ArrayList<>();
        String[] parts = qualifiedName.split("\\.");
        if (parts.length == 1) {
            // Simple name - search in scope
            PsiElement current = context;
            while (current != null) {
                if (current instanceof ValaBlock) {
                    results.addAll(collectLocalsInScope(current, parts[0]));
                }
                current = current.getParent();
            }
            ValaMethodDeclaration method = PsiTreeUtil.getParentOfType(context, ValaMethodDeclaration.class);
            if (method != null) {
                ValaParameters params = method.getParameters();
                if (params != null) {
                    for (ValaParameter param : params.getParameterList()) {
                        if (parts[0].equals(param.getName())) {
                            results.add(0, param);
                        }
                    }
                }
            }
            PsiElement classScope = PsiTreeUtil.getParentOfType(context, ValaClassDeclaration.class);
            if (classScope != null) {
                ValaFile file = (ValaFile) classScope.getContainingFile();
                results.addAll(findDeclarationsInFile(file, parts[0], false));
            }
            ValaFile file = PsiTreeUtil.getParentOfType(context, ValaFile.class);
            if (file != null) {
                results.addAll(findDeclarationsInFile(file, parts[0], false));
            }
            return results.stream().distinct().collect(Collectors.toList());
        }

        List<PsiNamedElement> currentTargets = findDeclarationsInScope(context, parts[0]);

        for (int i = 1; i < parts.length; i++) {
            String nextPart = parts[i];
            List<PsiNamedElement> nextTargets = new ArrayList<>();
            for (PsiNamedElement target : currentTargets) {
                nextTargets.addAll(findMembersInType(target, nextPart));
            }
            currentTargets = nextTargets;
            if (currentTargets.isEmpty()) {
                break;
            }
        }

        return currentTargets;
    }

    private static List<PsiNamedElement> findDeclarationsInScopeSimple(PsiElement context, String name) {
        List<PsiNamedElement> results = new ArrayList<>();

        if (context == null || name.isEmpty()) return results;

        // Local scope
        PsiElement current = context;
        while (current != null) {
            if (current instanceof ValaBlock || current instanceof ValaStatement) {
                results.addAll(collectLocalsInScope(current, name));
            }
            current = current.getParent();
        }

        // Method parameters
        ValaMethodDeclaration enclosingMethod = PsiTreeUtil.getParentOfType(context, ValaMethodDeclaration.class);
        if (enclosingMethod != null) {
            ValaParameters params = enclosingMethod.getParameters();
            if (params != null) {
                for (ValaParameter param : params.getParameterList()) {
                    if (name.equals(param.getName())) {
                        results.add(0, param);
                    }
                }
            }
        }

        // Class scope
        PsiElement classScope = PsiTreeUtil.getParentOfType(context, ValaClassDeclaration.class, ValaStructDeclaration.class, ValaInterfaceDeclaration.class);
        if (classScope != null) {
            ValaFile file = (ValaFile) classScope.getContainingFile();
            results.addAll(findDeclarationsInFile(file, name, false));
        }

        // Global/file scope
        ValaFile file = PsiTreeUtil.getParentOfType(context, ValaFile.class);
        if (file != null) {
            results.addAll(findDeclarationsInFile(file, name, false));
        }

        // Dedup
        return results.stream().distinct().collect(Collectors.toList());
    }

    private static List<PsiNamedElement> findMembersInType(PsiNamedElement type, String memberName) {
        List<PsiNamedElement> members = new ArrayList<>();

        if (type instanceof ValaClassDeclaration || type instanceof ValaStructDeclaration || type instanceof ValaInterfaceDeclaration) {
            // Fields
            Collection<ValaFieldDeclaration> fields = PsiTreeUtil.collectElementsOfType(type, ValaFieldDeclaration.class);
            for (ValaFieldDeclaration field : fields) {
                if (memberName.equals(field.getName())) {
                    members.add(field);
                }
            }

            // Methods
            Collection<ValaMethodDeclaration> methods = PsiTreeUtil.collectElementsOfType(type, ValaMethodDeclaration.class);
            for (ValaMethodDeclaration method : methods) {
                if (memberName.equals(method.getName())) {
                    members.add(method);
                }
            }

            // Properties
            Collection<ValaPropertyDeclaration> properties = PsiTreeUtil.collectElementsOfType(type, ValaPropertyDeclaration.class);
            for (ValaPropertyDeclaration prop : properties) {
                if (memberName.equals(prop.getName())) {
                    members.add(prop);
                }
            }

            // Signals
            Collection<ValaSignalDeclaration> signals = PsiTreeUtil.collectElementsOfType(type, ValaSignalDeclaration.class);
            for (ValaSignalDeclaration signal : signals) {
                if (memberName.equals(signal.getName())) {
                    members.add(signal);
                }
            }

            // Delegates
            Collection<ValaDelegateDeclaration> delegates = PsiTreeUtil.collectElementsOfType(type, ValaDelegateDeclaration.class);
            for (ValaDelegateDeclaration del : delegates) {
                if (memberName.equals(del.getName())) {
                    members.add(del);
                }
            }
        }

        return members;
    }

    private static List<PsiNamedElement> collectLocalsInScope(PsiElement scope, String name) {
        List<PsiNamedElement> locals = new ArrayList<>();
        if (name == null || name.isEmpty()) {
            locals.addAll(PsiTreeUtil.collectElementsOfType(scope, ValaLocalVariable.class));
            locals.addAll(PsiTreeUtil.collectElementsOfType(scope, ValaLocalTupleDeclaration.class));
        } else {
            for (ValaLocalVariable lv : PsiTreeUtil.collectElementsOfType(scope, ValaLocalVariable.class)) {
                if (name.equals(lv.getName())) locals.add(lv);
            }
            for (ValaLocalTupleDeclaration tuple : PsiTreeUtil.collectElementsOfType(scope, ValaLocalTupleDeclaration.class)) {
                if (name.equals(tuple.getName())) locals.add(tuple);
            }
        }
        return locals;
    }
}

