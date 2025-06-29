package com.tbusk.vala_plugin.code_style;

import com.intellij.configurationStore.Property;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;
import org.jetbrains.annotations.NotNull;

public class ValaCodeStyleSettings extends CustomCodeStyleSettings {

    @Property(externalName = "space_before_enum_declaration_lbrace")
    public boolean SPACE_BEFORE_ENUM_DECLARATION_LBRACE = true;

    @Property(externalName = "space_before_errordomain_declaration_lbrace")
    public boolean SPACE_BEFORE_ERRORDOMAIN_DECLARATION_LBRACE = true;

    @Property(externalName = "space_before_struct_declaration_lbrace")
    public boolean SPACE_BEFORE_STRUCT_DECLARATION_LBRACE = true;

    @Property(externalName = "space_before_class_declaration_lbrace")
    public boolean SPACE_BEFORE_CLASS_DECLARATION_LBRACE = true;

    @Property(externalName = "space_before_interface_declaration_lbrace")
    public boolean SPACE_BEFORE_INTERFACE_DECLARATION_LBRACE = true;

    @Property(externalName = "space_before_namespace_declaration_lbrace")
    public boolean SPACE_BEFORE_NAMESPACE_DECLARATION_LBRACE = true;

    @Property(externalName = "space_before_method_declaration_lbrace")
    public boolean SPACE_BEFORE_METHOD_DECLARATION_LBRACE = true;

    @Property(externalName = "space_before_property_declaration_lbrace")
    public boolean SPACE_BEFORE_PROPERTY_DECLARATION_LBRACE = true;

    @Property(externalName = "space_before_inherit_or_implement_colon")
    public boolean SPACE_BEFORE_INHERIT_OR_IMPLEMENT_COLON = true;

    @Property(externalName = "space_after_inherit_or_implement_colon")
    public boolean SPACE_AFTER_INHERIT_OR_IMPLEMENT_COLON = true;

    public ValaCodeStyleSettings(@NotNull CodeStyleSettings settings) {
        super("ValaCodeStyleSettings", settings);
    }

}
