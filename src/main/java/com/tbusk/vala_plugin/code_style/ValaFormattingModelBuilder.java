package com.tbusk.vala_plugin.code_style;

import com.intellij.formatting.*;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.tbusk.vala_plugin.language.ValaLanguage;
import com.tbusk.vala_plugin.psi.ValaTypes;
import org.jetbrains.annotations.NotNull;

public class ValaFormattingModelBuilder implements FormattingModelBuilder {

    private static SpacingBuilder createSpaceBuilder(CodeStyleSettings settings) {
        CommonCodeStyleSettings commonSettings = settings.getCommonSettings(ValaLanguage.INSTANCE.getID());
        ValaCodeStyleSettings customSettings = settings.getCustomSettings(ValaCodeStyleSettings.class);

        return new SpacingBuilder(settings, ValaLanguage.INSTANCE)

                .beforeInside(ValaTypes.LBRACE, ValaTypes.ERRORDOMAIN_DECLARATION).spacing(1, 1, 0, false, 0)
                .beforeInside(ValaTypes.LBRACE, ValaTypes.ENUM_DECLARATION).spacing(1, 1, 0, false, 0)
                .beforeInside(ValaTypes.LBRACE, ValaTypes.NAMESPACE_DECLARATION).spacing(1, 1, 0, false, 0)
                .beforeInside(ValaTypes.LBRACE, ValaTypes.STRUCT_DECLARATION).spacing(1, 1, 0, false, 0)
                .beforeInside(ValaTypes.EMBEDDED_STATEMENT, ValaTypes.IF_STATEMENT).spacing(1, 1, 0, false, 0)
                .beforeInside(ValaTypes.LBRACE, ValaTypes.FOR_STATEMENT).spacing(1, 1, 0, false, 0)
                .beforeInside(ValaTypes.LBRACE, ValaTypes.FOREACH_STATEMENT).spacing(1, 1, 0, false, 0)
                .beforeInside(ValaTypes.LBRACE, ValaTypes.DO_STATEMENT).spacing(1, 1, 0, false, 0)
                .beforeInside(ValaTypes.LBRACE, ValaTypes.WHILE_STATEMENT).spacing(1, 1, 0, false, 0)
                .beforeInside(ValaTypes.LBRACE, ValaTypes.CLASS_DECLARATION).spacing(1, 1, 0, false, 0)
                .betweenInside(ValaTypes.GREATER_THAN, ValaTypes.LAMBDA_EXPRESSION_BODY, ValaTypes.LAMBDA_EXPRESSION).spacing(1, 1, 0, false, 0)
                .betweenInside(ValaTypes.TRY, ValaTypes.BLOCK, ValaTypes.TRY_STATEMENT).spacing(1, 1, 0, false, 0)
                .betweenInside(ValaTypes.RPAREN, ValaTypes.BLOCK, ValaTypes.CATCH_CLAUSE).spacing(1, 1, 0, false, 0)
                .between(ValaTypes.NAMESPACE_MEMBER, ValaTypes.NAMESPACE_MEMBER).spacing(0, 0, 1, false, 1)
                .between(ValaTypes.CLASS_MEMBER, ValaTypes.CLASS_MEMBER).spacing(0, 0, 1, false, 1)
                .between(ValaTypes.INTERFACE_MEMBER, ValaTypes.INTERFACE_MEMBER).spacing(0, 0, 1, false, 1)
                .between(ValaTypes.STRUCT_MEMBER, ValaTypes.STRUCT_MEMBER).spacing(0, 0, 1, false, 1)
                .beforeInside(ValaTypes.BLOCK, ValaTypes.PROPERTY_SET_ACCESSOR).spacing(1, 1, 0, false, 0)
                .beforeInside(ValaTypes.BLOCK, ValaTypes.PROPERTY_GET_ACCESSOR).spacing(1, 1, 0, false, 0)
                .afterInside(ValaTypes.IDENTIFIER, ValaTypes.PROPERTY_DECLARATION).spacing(1, 1, 0, false, 0)
                .afterInside(ValaTypes.CONSTRUCT, ValaTypes.CONSTRUCTOR_DECLARATION).spacing(1, 1, 0, false, 0)
                .beforeInside(ValaTypes.LBRACE, ValaTypes.SWITCH_STATEMENT).spacing(1, 1, 0, false, 0)
                .beforeInside(ValaTypes.LBRACE, ValaTypes.SIGNAL_DECLARATION).spacing(1, 1, 0, false, 0)

                .beforeInside(ValaTypes.BLOCK, ValaTypes.BLOCK).spacing(0, 1, 0, false, 2)

                // Spacing Before
                .beforeInside(ValaTypes.METHOD_CALL, ValaTypes.PRIMARY_EXPRESSION).spaceIf(commonSettings.SPACE_BEFORE_METHOD_CALL_PARENTHESES)
                .beforeInside(ValaTypes.LPAREN, ValaTypes.METHOD_DECLARATION).spaceIf(commonSettings.SPACE_BEFORE_METHOD_PARENTHESES)
                .beforeInside(ValaTypes.LPAREN, ValaTypes.IF_STATEMENT).spaceIf(commonSettings.SPACE_BEFORE_IF_PARENTHESES)
                .beforeInside(ValaTypes.LPAREN, ValaTypes.FOR_STATEMENT).spaceIf(commonSettings.SPACE_BEFORE_FOR_PARENTHESES)
                .beforeInside(ValaTypes.LPAREN, ValaTypes.FOREACH_STATEMENT).spaceIf(commonSettings.SPACE_BEFORE_FOR_PARENTHESES)
                .beforeInside(ValaTypes.LPAREN, ValaTypes.WHILE_STATEMENT).spaceIf(commonSettings.SPACE_BEFORE_WHILE_PARENTHESES)
                .beforeInside(ValaTypes.LPAREN, ValaTypes.SWITCH_STATEMENT).spaceIf(commonSettings.SPACE_BEFORE_SWITCH_PARENTHESES)
                .beforeInside(ValaTypes.LPAREN, ValaTypes.CATCH_CLAUSE).spaceIf(commonSettings.SPACE_BEFORE_CATCH_PARENTHESES)
                .beforeInside(ValaTypes.LPAREN, ValaTypes.TRY_STATEMENT).spaceIf(commonSettings.SPACE_BEFORE_TRY_PARENTHESES)

                // Space before left brace
                .beforeInside(ValaTypes.LBRACE, ValaTypes.ENUM_DECLARATION).spaceIf(customSettings.SPACE_BEFORE_ENUM_DECLARATION_LBRACE)
                .beforeInside(ValaTypes.LBRACE, ValaTypes.ERRORDOMAIN_DECLARATION).spaceIf(customSettings.SPACE_BEFORE_ERRORDOMAIN_DECLARATION_LBRACE)
                .beforeInside(ValaTypes.LBRACE, ValaTypes.STRUCT_DECLARATION).spaceIf(customSettings.SPACE_BEFORE_STRUCT_DECLARATION_LBRACE)
                .beforeInside(ValaTypes.LBRACE, ValaTypes.CLASS_DECLARATION).spaceIf(customSettings.SPACE_BEFORE_CLASS_DECLARATION_LBRACE)
                .beforeInside(ValaTypes.LBRACE, ValaTypes.INTERFACE_DECLARATION).spaceIf(customSettings.SPACE_BEFORE_INTERFACE_DECLARATION_LBRACE)
                .beforeInside(ValaTypes.LBRACE, ValaTypes.NAMESPACE_DECLARATION).spaceIf(customSettings.SPACE_BEFORE_NAMESPACE_DECLARATION_LBRACE)
                .beforeInside(ValaTypes.BLOCK, ValaTypes.METHOD_DECLARATION).spaceIf(customSettings.SPACE_BEFORE_METHOD_DECLARATION_LBRACE)
                .beforeInside(ValaTypes.LBRACE, ValaTypes.PROPERTY_DECLARATION).spaceIf(customSettings.SPACE_BEFORE_PROPERTY_DECLARATION_LBRACE)


                .before(ValaTypes.COMMA).spaceIf(commonSettings.SPACE_BEFORE_COMMA)

                // Spacing After
                .after(ValaTypes.COMMA).spaceIf(commonSettings.SPACE_AFTER_COMMA)

                // Spacing around colon
                .beforeInside(ValaTypes.COLON, ValaTypes.CLASS_DECLARATION).spaceIf(customSettings.SPACE_BEFORE_INHERIT_OR_IMPLEMENT_COLON)
                .afterInside(ValaTypes.COLON, ValaTypes.CLASS_DECLARATION).spaceIf(customSettings.SPACE_AFTER_INHERIT_OR_IMPLEMENT_COLON)
                .beforeInside(ValaTypes.COLON, ValaTypes.INTERFACE_DECLARATION).spaceIf(customSettings.SPACE_BEFORE_INHERIT_OR_IMPLEMENT_COLON)
                .afterInside(ValaTypes.COLON, ValaTypes.INTERFACE_DECLARATION).spaceIf(customSettings.SPACE_AFTER_INHERIT_OR_IMPLEMENT_COLON)
                .beforeInside(ValaTypes.COLON, ValaTypes.STRUCT_DECLARATION).spaceIf(customSettings.SPACE_BEFORE_INHERIT_OR_IMPLEMENT_COLON)
                .afterInside(ValaTypes.COLON, ValaTypes.STRUCT_DECLARATION).spaceIf(customSettings.SPACE_AFTER_INHERIT_OR_IMPLEMENT_COLON)

                .after(ValaTypes.ASSIGNMENT_OPERATOR).spacing(1, 1, 0, true, 0)
                .before(ValaTypes.ASSIGNMENT_OPERATOR).spacing(1, 1, 0, true, 0)

                .after(ValaTypes.PLUS).spacing(1, 1, 0, true, 0)
                .before(ValaTypes.PLUS).spacing(1, 1, 0, true, 0)

                .after(ValaTypes.MINUS).spacing(1, 1, 0, true, 0)
                .before(ValaTypes.MINUS).spacing(1, 1, 0, true, 0)

                .afterInside(ValaTypes.STAR, ValaTypes.MULTIPLICATIVE_EXPRESSION).spacing(1, 1, 0, true, 0)
                .beforeInside(ValaTypes.STAR, ValaTypes.MULTIPLICATIVE_EXPRESSION).spacing(1, 1, 0, true, 0)

                .beforeInside(ValaTypes.STAR, ValaTypes.EXPRESSION).spacing(0, 0, 0, true, 0)

                .after(ValaTypes.FORWARD_SLASH).spacing(1, 1, 0, true, 0)
                .before(ValaTypes.FORWARD_SLASH).spacing(1, 1, 0, true, 0)

                .after(ValaTypes.MODULO).spacing(1, 1, 0, true, 0)
                .before(ValaTypes.MODULO).spacing(1, 1, 0, true, 0)

                .between(ValaTypes.SYMBOL, ValaTypes.SEMICOLON).spacing(0, 0, 0, false, 0)
                .between(ValaTypes.SIMPLE_NAME, ValaTypes.SEMICOLON).spacing(0, 0, 0, false, 0)
                .between(ValaTypes.EXPRESSION, ValaTypes.SEMICOLON).spacing(0, 0, 0, false, 0)
                .between(ValaTypes.METHOD_CALL, ValaTypes.SEMICOLON).spacing(0, 0, 0, false, 0)
                .between(ValaTypes.EQUALS, ValaTypes.EXPRESSION).spacing(1, 1, 0, false, 0)
                .betweenInside(ValaTypes.SEMICOLON, ValaTypes.EXPRESSION, ValaTypes.FOR_STATEMENT).spacing(1, 1, 0, false, 0)
                .betweenInside(ValaTypes.SEMICOLON, ValaTypes.FOR_ITERATOR, ValaTypes.FOR_STATEMENT).spacing(1, 1, 0, false, 0)
                .betweenInside(ValaTypes.FOR_INITIALIZER, ValaTypes.SEMICOLON, ValaTypes.FOR_STATEMENT).spacing(0, 0, 0, false, 0)
                .betweenInside(ValaTypes.EQUALS_EQUALS, ValaTypes.RELATIONAL_EXPRESSION, ValaTypes.EQUALITY_EXPRESSION).spacing(1, 1, 0, false, 0)
                .betweenInside(ValaTypes.NOT_EQUALS, ValaTypes.RELATIONAL_EXPRESSION, ValaTypes.EQUALITY_EXPRESSION).spacing(1, 1, 0, false, 0)
                .betweenInside(ValaTypes.RELATIONAL_EXPRESSION, ValaTypes.EQUALS_EQUALS, ValaTypes.EQUALITY_EXPRESSION).spacing(1, 1, 0, false, 0)
                .betweenInside(ValaTypes.RELATIONAL_EXPRESSION, ValaTypes.NOT_EQUALS, ValaTypes.EQUALITY_EXPRESSION).spacing(1, 1, 0, false, 0)
                .before(ValaTypes.POST_INCREMENT_EXPRESSION).spacing(0, 0, 0, false, 0)
                .before(ValaTypes.POST_DECREMENT_EXPRESSION).spacing(0, 0, 0, false, 0)
                .betweenInside(ValaTypes.BLOCK, ValaTypes.SEMICOLON, ValaTypes.BLOCK).spacing(0, 0, 0, false, 0)
                .betweenInside(ValaTypes.ATTRIBUTES, ValaTypes.ENUM_DECLARATION, ValaTypes.CLASS_MEMBER).spacing(0, 0, 1, true, 1)

                .afterInside(ValaTypes.LPAREN, ValaTypes.METHOD_CALL).spacing(0, 1, 0, false, 1)
                .beforeInside(ValaTypes.RPAREN, ValaTypes.METHOD_CALL).spacing(0, 1, 0, false, 1)
                ;
    }

    @Override
    public @NotNull FormattingModel createModel(@NotNull FormattingContext formattingContext) {
        final CodeStyleSettings codeStyleSettings = formattingContext.getCodeStyleSettings();
        return FormattingModelProvider
                .createFormattingModelForPsiFile(
                        formattingContext.getContainingFile(),
                        new ValaBlock(formattingContext.getNode(),
                                Wrap.createWrap(WrapType.NONE, false),
                                Alignment.createAlignment(),
                                Indent.getNoneIndent(),
                                createSpaceBuilder(codeStyleSettings)),
                        codeStyleSettings);
    }
}
