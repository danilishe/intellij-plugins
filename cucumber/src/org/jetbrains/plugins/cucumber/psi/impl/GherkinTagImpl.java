package org.jetbrains.plugins.cucumber.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiReference;
import com.intellij.psi.impl.source.resolve.reference.ReferenceProvidersRegistry;
import com.intellij.psi.util.CachedValueProvider;
import com.intellij.psi.util.CachedValuesManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.plugins.cucumber.psi.GherkinElementVisitor;
import org.jetbrains.plugins.cucumber.psi.GherkinTag;

/**
 * @author yole
 */
public class GherkinTagImpl extends GherkinPsiElementBase implements GherkinTag {
  public GherkinTagImpl(@NotNull final ASTNode node) {
    super(node);
  }

  @Override
  protected void acceptGherkin(GherkinElementVisitor gherkinElementVisitor) {
    gherkinElementVisitor.visitTag(this);
  }

  @Override
  public String getName() {
    return getText();
  }

  @Override
  public PsiReference @NotNull [] getReferences() {
    return CachedValuesManager.getCachedValue(this, () -> CachedValueProvider.Result.create(getReferencesInner(), this));
  }

  private PsiReference[] getReferencesInner() {
    return ReferenceProvidersRegistry.getReferencesFromProviders(this);
  }

  @Override
  public String toString() {
    return "GherkinTag:" + getText();
  }
}
