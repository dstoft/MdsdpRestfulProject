/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import sdu.mdsd.restful.generator.RestControllerGenerationGenerator;
import sdu.mdsd.restful.restControllerGeneration.Attribute;
import sdu.mdsd.restful.restControllerGeneration.AttributeType;
import sdu.mdsd.restful.restControllerGeneration.AttributeUse;
import sdu.mdsd.restful.restControllerGeneration.Controller;
import sdu.mdsd.restful.restControllerGeneration.CreateMethodExclude;
import sdu.mdsd.restful.restControllerGeneration.CreateMethodWith;
import sdu.mdsd.restful.restControllerGeneration.DeleteMethod;
import sdu.mdsd.restful.restControllerGeneration.Entity;
import sdu.mdsd.restful.restControllerGeneration.EntityModel;
import sdu.mdsd.restful.restControllerGeneration.ExternalDef;
import sdu.mdsd.restful.restControllerGeneration.ExternalUse;
import sdu.mdsd.restful.restControllerGeneration.ExternalUseOfAttribute;
import sdu.mdsd.restful.restControllerGeneration.GetMethod;
import sdu.mdsd.restful.restControllerGeneration.ListType;
import sdu.mdsd.restful.restControllerGeneration.Name;
import sdu.mdsd.restful.restControllerGeneration.RefType;
import sdu.mdsd.restful.restControllerGeneration.Reference;
import sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage;
import sdu.mdsd.restful.restControllerGeneration.SimpleType;
import sdu.mdsd.restful.restControllerGeneration.UpdateMethod;
import sdu.mdsd.restful.scoping.AbstractRestControllerGenerationScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class RestControllerGenerationScopeProvider extends AbstractRestControllerGenerationScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _switchResult = null;
    boolean _matched = false;
    if (context instanceof ExternalUse) {
      _matched=true;
      final EntityModel model = EcoreUtil2.<EntityModel>getContainerOfType(context, EntityModel.class);
      final Attribute attribute = EcoreUtil2.<Attribute>getContainerOfType(context, Attribute.class);
      final ArrayList<ExternalDef> candidates = new ArrayList<ExternalDef>();
      final Function1<ExternalDef, Boolean> _function = (ExternalDef it) -> {
        return Boolean.valueOf(this.compareAttributeType(it.getType(), attribute.getType()));
      };
      Iterables.<ExternalDef>addAll(candidates, IterableExtensions.<ExternalDef>filter(Iterables.<ExternalDef>filter(model.getDeclarations(), ExternalDef.class), _function));
      return Scopes.scopeFor(candidates);
    }
    if (!_matched) {
      if (context instanceof AttributeUse) {
        _matched=true;
        final ExternalUseOfAttribute externalUse = EcoreUtil2.<ExternalUseOfAttribute>getContainerOfType(context, ExternalUseOfAttribute.class);
        final ExternalDef externalDef = externalUse.getExternal();
        final Entity entity = EcoreUtil2.<Entity>getContainerOfType(context, Entity.class);
        final ArrayList<Attribute> candidates = new ArrayList<Attribute>();
        final Function1<Attribute, Boolean> _function = (Attribute it) -> {
          return Boolean.valueOf(this.compareAttributeType(it.getType(), externalDef.getType()));
        };
        Iterables.<Attribute>addAll(candidates, IterableExtensions.<Attribute>filter(RestControllerGenerationGenerator.getAllAttributesStatic(entity), _function));
        return Scopes.scopeFor(candidates);
      }
    }
    if (!_matched) {
      if (context instanceof CreateMethodWith) {
        boolean _equals = Objects.equal(reference, RestControllerGenerationPackage.Literals.CREATE_METHOD_WITH__ENTITY_ID);
        if (_equals) {
          _matched=true;
          final ArrayList<Attribute> candidates = new ArrayList<Attribute>();
          Iterables.<Attribute>addAll(candidates, Iterables.<Attribute>filter(((CreateMethodWith)context).getEntity().getDeclarations(), Attribute.class));
          return Scopes.scopeFor(candidates);
        }
      }
    }
    if (!_matched) {
      if (context instanceof CreateMethodExclude) {
        _matched=true;
        return Scopes.scopeFor(this.getControllersAttributes(context));
      }
    }
    if (!_matched) {
      if (context instanceof GetMethod) {
        _matched=true;
        return Scopes.scopeFor(this.getControllersAttributes(context));
      }
    }
    if (!_matched) {
      if (context instanceof UpdateMethod) {
        _matched=true;
        return Scopes.scopeFor(this.getControllersAttributes(context));
      }
    }
    if (!_matched) {
      if (context instanceof DeleteMethod) {
        _matched=true;
        return Scopes.scopeFor(this.getControllersAttributes(context));
      }
    }
    if (!_matched) {
      if (context instanceof Name) {
        _matched=true;
        final Entity entity = EcoreUtil2.<Entity>getContainerOfType(context, Entity.class);
        return Scopes.scopeFor(RestControllerGenerationGenerator.getAllAttributesStatic(entity));
      }
    }
    if (!_matched) {
      if (context instanceof Reference) {
        boolean _equals = Objects.equal(reference, RestControllerGenerationPackage.Literals.REFERENCE__REFERENCE);
        if (_equals) {
          _matched=true;
          final Entity entity = EcoreUtil2.<Entity>getContainerOfType(context, Entity.class);
          final Function1<Attribute, Boolean> _function = (Attribute it) -> {
            return Boolean.valueOf(((it.getType() instanceof RefType) || (it.getType() instanceof ListType)));
          };
          final Iterable<Attribute> candidates = IterableExtensions.<Attribute>filter(RestControllerGenerationGenerator.getAllAttributesStatic(entity), _function);
          return Scopes.scopeFor(candidates);
        }
      }
    }
    if (!_matched) {
      if (context instanceof Reference) {
        boolean _equals = Objects.equal(reference, RestControllerGenerationPackage.Literals.REFERENCE__ATTRIBUTE);
        if (_equals) {
          _matched=true;
          _switchResult = Scopes.scopeFor(RestControllerGenerationGenerator.getAllAttributesStatic(this.getReferenceAttributeEntity(((Reference)context).getReference().getType())));
        }
      }
    }
    if (!_matched) {
      _switchResult = super.getScope(context, reference);
    }
    return _switchResult;
  }
  
  private ArrayList<Attribute> getControllersAttributes(final EObject context) {
    final ArrayList<Attribute> candidates = new ArrayList<Attribute>();
    Controller controller = EcoreUtil2.<Controller>getContainerOfType(context, Controller.class);
    candidates.addAll(RestControllerGenerationGenerator.getAllAttributesStatic(controller.getEntity()));
    return candidates;
  }
  
  private boolean compareAttributeType(final AttributeType type, final AttributeType other) {
    boolean _xblockexpression = false;
    {
      if ((type == null)) {
        return false;
      }
      if ((other == null)) {
        return false;
      }
      Class<? extends AttributeType> _class = type.getClass();
      Class<? extends AttributeType> _class_1 = other.getClass();
      boolean _notEquals = (!Objects.equal(_class, _class_1));
      if (_notEquals) {
        return false;
      }
      boolean _switchResult = false;
      boolean _matched = false;
      if (type instanceof SimpleType) {
        _matched=true;
        boolean _xblockexpression_1 = false;
        {
          final SimpleType type2 = ((SimpleType) other);
          String _name = ((SimpleType)type).getType().getName();
          String _name_1 = type2.getType().getName();
          _xblockexpression_1 = Objects.equal(_name, _name_1);
        }
        _switchResult = _xblockexpression_1;
      }
      if (!_matched) {
        if (type instanceof RefType) {
          _matched=true;
          boolean _xblockexpression_1 = false;
          {
            final RefType type2 = ((RefType) other);
            String _name = ((RefType)type).getType().getName();
            String _name_1 = type2.getType().getName();
            _xblockexpression_1 = Objects.equal(_name, _name_1);
          }
          _switchResult = _xblockexpression_1;
        }
      }
      if (!_matched) {
        if (type instanceof ListType) {
          _matched=true;
          boolean _xblockexpression_1 = false;
          {
            final ListType type2 = ((ListType) other);
            String _name = ((ListType)type).getType().getName();
            String _name_1 = type2.getType().getName();
            _xblockexpression_1 = Objects.equal(_name, _name_1);
          }
          _switchResult = _xblockexpression_1;
        }
      }
      if (!_matched) {
        _switchResult = false;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  private Entity _getReferenceAttributeEntity(final RefType type) {
    return type.getType();
  }
  
  private Entity _getReferenceAttributeEntity(final ListType type) {
    return type.getType();
  }
  
  private Entity getReferenceAttributeEntity(final AttributeType type) {
    if (type instanceof ListType) {
      return _getReferenceAttributeEntity((ListType)type);
    } else if (type instanceof RefType) {
      return _getReferenceAttributeEntity((RefType)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type).toString());
    }
  }
}
