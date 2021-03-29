/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.generator;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import sdu.mdsd.restful.restControllerGeneration.Attribute;
import sdu.mdsd.restful.restControllerGeneration.Entity;
import sdu.mdsd.restful.restControllerGeneration.EntityModel;
import sdu.mdsd.restful.restControllerGeneration.ExternalDef;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RestControllerGenerationGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final EntityModel em = Iterators.<EntityModel>filter(resource.getAllContents(), EntityModel.class).next();
    System.out.println("Model:");
    this.display(em);
    this.generateExternalInterface(em, fsa);
    this.generateModelFiles(em, fsa);
  }
  
  public void display(final EObject model) {
    try {
      final XMLResourceImpl res = new XMLResourceImpl();
      res.getContents().add(EcoreUtil.<EObject>copy(model));
      System.out.println("Dump of model:");
      res.save(System.out, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void generateModelFiles(final EntityModel model, final IFileSystemAccess2 fsa) {
    final Consumer<Entity> _function = (Entity it) -> {
      this.generateEntity(it, fsa);
    };
    Iterables.<Entity>filter(model.getDeclarations(), Entity.class).forEach(_function);
  }
  
  public void generateEntity(final Entity entity, final IFileSystemAccess2 fsa) {
    final EntityModel model = EcoreUtil2.<EntityModel>getContainerOfType(entity, EntityModel.class);
    String _name = model.getName();
    String _plus = (_name + "/Models/");
    String _name_1 = entity.getName();
    String _plus_1 = (_plus + _name_1);
    String _plus_2 = (_plus_1 + ".cs");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("namespace ");
    String _name_2 = model.getName();
    _builder.append(_name_2);
    _builder.append(".Models {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public class ");
    String _name_3 = entity.getName();
    _builder.append(_name_3, "\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    CharSequence _generateConstructor = this.generateConstructor(entity);
    _builder.append(_generateConstructor, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    CharSequence _generateAttributes = this.generateAttributes(entity);
    _builder.append(_generateAttributes, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(_plus_2, _builder);
  }
  
  public CharSequence generateAttributes(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Attribute> _attributes = entity.getAttributes();
      for(final Attribute x : _attributes) {
        CharSequence _generateAttribute = this.generateAttribute(x);
        _builder.append(_generateAttribute);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateAttribute(final Attribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _name = attribute.getType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _name_1 = attribute.getName();
    _builder.append(_name_1);
    _builder.append(" { get; }");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateConstructor(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _name = entity.getName();
    _builder.append(_name);
    _builder.append("(");
    {
      EList<Attribute> _attributes = entity.getAttributes();
      boolean _hasElements = false;
      for(final Attribute x : _attributes) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        CharSequence _generateConstructorParameter = this.generateConstructorParameter(x);
        _builder.append(_generateConstructorParameter);
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      EList<Attribute> _attributes_1 = entity.getAttributes();
      for(final Attribute x_1 : _attributes_1) {
        _builder.append("\t");
        CharSequence _generateConstructorSet = this.generateConstructorSet(x_1);
        _builder.append(_generateConstructorSet, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateConstructorParameter(final Attribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = attribute.getType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _firstLower = StringExtensions.toFirstLower(attribute.getName());
    _builder.append(_firstLower);
    return _builder;
  }
  
  public CharSequence generateConstructorSet(final Attribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.");
    String _name = attribute.getName();
    _builder.append(_name);
    _builder.append(" = ");
    String _firstLower = StringExtensions.toFirstLower(attribute.getName());
    _builder.append(_firstLower);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public void generateExternalInterface(final EntityModel em, final IFileSystemAccess2 fsa) {
    String _name = em.getName();
    String _plus = (_name + "/ExternalCode.cs");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("namespace ");
    String _name_1 = em.getName();
    _builder.append(_name_1);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public interface ExternalCode {");
    _builder.newLine();
    {
      Iterable<ExternalDef> _filter = Iterables.<ExternalDef>filter(em.getDeclarations(), ExternalDef.class);
      for(final ExternalDef x : _filter) {
        _builder.append("\t\t");
        _builder.append("public boolean ");
        String _name_2 = x.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append("(");
        String _name_3 = x.getType().getName();
        _builder.append(_name_3, "\t\t");
        _builder.append(" parameter);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(_plus, _builder);
  }
}
