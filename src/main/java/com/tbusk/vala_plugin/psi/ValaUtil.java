package com.tbusk.vala_plugin.psi;

import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.tbusk.vala_plugin.language.ValaFile;

import java.util.*;

public class ValaUtil {

    public static List<PsiNamedElement> findDeclarationsInFile(ValaFile file, String name) {
        List<PsiNamedElement> allDeclarationsInFile = new ArrayList<>();

        Collection<ValaParameter> parameterDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaParameter.class);
        allDeclarationsInFile.addAll(parameterDeclarations);

        Collection<ValaForeachStatement> foreachDeclaration = PsiTreeUtil.collectElementsOfType(file, ValaForeachStatement.class);
        allDeclarationsInFile.addAll(foreachDeclaration);

        Collection<ValaCatchClause> catchDeclaration = PsiTreeUtil.collectElementsOfType(file, ValaCatchClause.class);
        allDeclarationsInFile.addAll(catchDeclaration);

        Collection<ValaLocalVariable> localVariables = PsiTreeUtil.collectElementsOfType(file, ValaLocalVariable.class);
        allDeclarationsInFile.addAll(localVariables);

        Collection<ValaLocalTupleDeclaration> localTupleDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaLocalTupleDeclaration.class);
        allDeclarationsInFile.addAll(localTupleDeclarations);

        Collection<ValaConstantDeclaration> constantDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaConstantDeclaration.class);
        allDeclarationsInFile.addAll(constantDeclarations);

        Collection<ValaClassDeclaration> classDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaClassDeclaration.class);
        allDeclarationsInFile.addAll(classDeclarations);

        Collection<ValaFieldDeclarationSection> fieldDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaFieldDeclarationSection.class);
        allDeclarationsInFile.addAll(fieldDeclarations);

        Collection<ValaStructDeclaration> structDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaStructDeclaration.class);
        allDeclarationsInFile.addAll(structDeclarations);

        Collection<ValaEnumDeclaration> enumDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaEnumDeclaration.class);
        allDeclarationsInFile.addAll(enumDeclarations);

        Collection<ValaInterfaceDeclaration> interfaceDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaInterfaceDeclaration.class);
        allDeclarationsInFile.addAll(interfaceDeclarations);

        Collection<ValaErrordomainDeclaration> errordomainDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaErrordomainDeclaration.class);
        allDeclarationsInFile.addAll(errordomainDeclarations);

        Collection<ValaPropertyDeclaration> propertyDeclarations = PsiTreeUtil.collectElementsOfType(file, ValaPropertyDeclaration.class);
        allDeclarationsInFile.addAll(propertyDeclarations);

        Collection<ValaDestructorDeclaration> destructorDeclaration = PsiTreeUtil.collectElementsOfType(file, ValaDestructorDeclaration.class);
        allDeclarationsInFile.addAll(destructorDeclaration);

        Set<PsiNamedElement> results = new HashSet<>();

        for (PsiNamedElement element : allDeclarationsInFile) {
            if (element.getName() != null && element.getName().equals(name)) {
                results.add(element);
            }
        }

        return new ArrayList<>(results);
    }
}

