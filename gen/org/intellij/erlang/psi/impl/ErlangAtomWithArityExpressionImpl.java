// This is a generated file. Not intended for manual editing.
package org.intellij.erlang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.erlang.ErlangTypes.*;
import org.intellij.erlang.psi.*;

public class ErlangAtomWithArityExpressionImpl extends ErlangExpressionImpl implements ErlangAtomWithArityExpression {

  public ErlangAtomWithArityExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ErlangVisitor) ((ErlangVisitor)visitor).visitAtomWithArityExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ErlangQAtom getQAtom() {
    return findNotNullChildByClass(ErlangQAtom.class);
  }

  @Override
  @NotNull
  public PsiElement getOpArDiv() {
    return findNotNullChildByType(ERL_OP_AR_DIV);
  }

  @Override
  @NotNull
  public PsiElement getInteger() {
    return findNotNullChildByType(ERL_INTEGER);
  }

}
