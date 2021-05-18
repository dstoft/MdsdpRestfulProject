/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import sdu.mdsd.restful.generator.RestControllerGenerationGenerator;
import sdu.mdsd.restful.restControllerGeneration.Attribute;
import sdu.mdsd.restful.restControllerGeneration.Entity;
import sdu.mdsd.restful.restControllerGeneration.ExternalUseOfAttribute;
import sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage;
import sdu.mdsd.restful.restControllerGeneration.Type;
import sdu.mdsd.restful.validation.AbstractRestControllerGenerationValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class RestControllerGenerationValidator extends AbstractRestControllerGenerationValidator {
  @Check
  public void checkEntityNoCyclicBase(final Entity entity) {
    final HashSet<String> seen = new HashSet<String>();
    seen.add(entity.getName());
    boolean _selfInherits = this.selfInherits(entity.getBase(), seen);
    if (_selfInherits) {
      this.error("Cyclic base relation", RestControllerGenerationPackage.Literals.ENTITY__BASE, "cyclicInheritance");
    }
  }
  
  public boolean selfInherits(final Entity next, final Set<String> seen) {
    boolean _xifexpression = false;
    if ((next == null)) {
      _xifexpression = false;
    } else {
      boolean _xifexpression_1 = false;
      boolean _contains = seen.contains(next.getName());
      if (_contains) {
        _xifexpression_1 = true;
      } else {
        boolean _xblockexpression = false;
        {
          seen.add(next.getName());
          _xblockexpression = this.selfInherits(next.getBase(), seen);
        }
        _xifexpression_1 = _xblockexpression;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  @Check
  public void checkNoDuplicateAttribute(final Attribute attribute) {
    final Entity entity = EcoreUtil2.<Entity>getContainerOfType(attribute, Entity.class);
    final ArrayList<Attribute> baseAttributes = RestControllerGenerationGenerator.getAllAttributesStatic(entity.getBase());
    final Function1<Attribute, Boolean> _function = (Attribute it) -> {
      String _name = it.getName();
      String _name_1 = attribute.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    boolean _exists = IterableExtensions.<Attribute>exists(baseAttributes, _function);
    if (_exists) {
      this.error("Duplicate attribute name from base", RestControllerGenerationPackage.Literals.ATTRIBUTE__NAME, "duplicateName");
    }
  }
  
  @Check
  public void checkRequirementType(final ExternalUseOfAttribute requirement) {
    Type _type = requirement.getExternal().getType();
    Type _type_1 = requirement.getAttribute().getType();
    boolean _tripleNotEquals = (_type != _type_1);
    if (_tripleNotEquals) {
      this.error("Type mismatch between external function and attribute", RestControllerGenerationPackage.Literals.EXTERNAL_USE_OF_ATTRIBUTE__ATTRIBUTE, "typeMismatch");
    }
  }
}
