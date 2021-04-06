/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.generator;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.Arrays;
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
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import sdu.mdsd.restful.restControllerGeneration.Add;
import sdu.mdsd.restful.restControllerGeneration.Attribute;
import sdu.mdsd.restful.restControllerGeneration.AttributeRequirement;
import sdu.mdsd.restful.restControllerGeneration.Comparison;
import sdu.mdsd.restful.restControllerGeneration.Conjunction;
import sdu.mdsd.restful.restControllerGeneration.Controller;
import sdu.mdsd.restful.restControllerGeneration.ControllerMethod;
import sdu.mdsd.restful.restControllerGeneration.CreateMethod;
import sdu.mdsd.restful.restControllerGeneration.DeleteMethod;
import sdu.mdsd.restful.restControllerGeneration.Disjunction;
import sdu.mdsd.restful.restControllerGeneration.Div;
import sdu.mdsd.restful.restControllerGeneration.Entity;
import sdu.mdsd.restful.restControllerGeneration.EntityModel;
import sdu.mdsd.restful.restControllerGeneration.Expression;
import sdu.mdsd.restful.restControllerGeneration.ExternalDef;
import sdu.mdsd.restful.restControllerGeneration.ExternalUse;
import sdu.mdsd.restful.restControllerGeneration.GetMethod;
import sdu.mdsd.restful.restControllerGeneration.IntExp;
import sdu.mdsd.restful.restControllerGeneration.ListMethod;
import sdu.mdsd.restful.restControllerGeneration.Mul;
import sdu.mdsd.restful.restControllerGeneration.Name;
import sdu.mdsd.restful.restControllerGeneration.Proposition;
import sdu.mdsd.restful.restControllerGeneration.RelEQ;
import sdu.mdsd.restful.restControllerGeneration.RelGT;
import sdu.mdsd.restful.restControllerGeneration.RelGTE;
import sdu.mdsd.restful.restControllerGeneration.RelLT;
import sdu.mdsd.restful.restControllerGeneration.RelLTE;
import sdu.mdsd.restful.restControllerGeneration.RelationalOp;
import sdu.mdsd.restful.restControllerGeneration.Sub;
import sdu.mdsd.restful.restControllerGeneration.UpdateMethod;

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
    this.generateControllerFiles(em, fsa);
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
    _builder.append("using System;");
    _builder.newLine();
    _builder.newLine();
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
    _builder.append("\t\t");
    CharSequence _generateAttributeRequirements = this.generateAttributeRequirements(entity);
    _builder.append(_generateAttributeRequirements, "\t\t");
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
    _builder.append("private readonly IExternalCode ExternalCode;");
    _builder.newLine();
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
    CharSequence _externCodeCtorParameter = this.externCodeCtorParameter(entity);
    _builder.append(_externCodeCtorParameter);
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
    _builder.append("\t");
    _builder.append("ExternalCode = externalCode;");
    _builder.newLine();
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
  
  public CharSequence externCodeCtorParameter(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IExternalCode externalCode");
    {
      int _size = entity.getAttributes().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append(", ");
      }
    }
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
  
  public CharSequence generateAttributeRequirements(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void checkRequirements() {");
    _builder.newLine();
    {
      final Function1<Attribute, Boolean> _function = (Attribute a) -> {
        EObject _requirement = a.getRequirement();
        return Boolean.valueOf((_requirement != null));
      };
      Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(entity.getAttributes(), _function);
      for(final Attribute x : _filter) {
        _builder.append("\t");
        _builder.append("if(!(");
        CharSequence _generateAttributeRequirement = this.generateAttributeRequirement(x.getRequirement(), x);
        _builder.append(_generateAttributeRequirement, "\t");
        _builder.append(")) throw new Exception(\"Requirement not fulfilled\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateAttributeRequirement(final ExternalUse requirement, final Attribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ExternalCode.");
    String _name = requirement.getExternal().getName();
    _builder.append(_name);
    _builder.append("(");
    String _name_1 = attribute.getName();
    _builder.append(_name_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _generateAttributeRequirement(final AttributeRequirement requirement, final Attribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateLogic = this.generateLogic(requirement.getLogic());
    _builder.append(_generateLogic);
    return _builder;
  }
  
  protected CharSequence _generateLogic(final Disjunction x) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateLogic = this.generateLogic(x.getLeft());
    _builder.append(_generateLogic);
    _builder.append("||");
    CharSequence _generateLogic_1 = this.generateLogic(x.getRight());
    _builder.append(_generateLogic_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _generateLogic(final Conjunction x) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateLogic = this.generateLogic(x.getLeft());
    _builder.append(_generateLogic);
    _builder.append("&&");
    CharSequence _generateLogic_1 = this.generateLogic(x.getRight());
    _builder.append(_generateLogic_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _generateLogic(final Comparison x) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExp = this.generateExp(x.getLeft());
    _builder.append(_generateExp);
    String _generateOp = this.generateOp(x.getOp());
    _builder.append(_generateOp);
    CharSequence _generateExp_1 = this.generateExp(x.getRight());
    _builder.append(_generateExp_1);
    _builder.append(")");
    return _builder;
  }
  
  public String generateOp(final RelationalOp op) {
    String _switchResult = null;
    boolean _matched = false;
    if (op instanceof RelEQ) {
      _matched=true;
      _switchResult = "==";
    }
    if (!_matched) {
      if (op instanceof RelLT) {
        _matched=true;
        _switchResult = "<";
      }
    }
    if (!_matched) {
      if (op instanceof RelGT) {
        _matched=true;
        _switchResult = ">";
      }
    }
    if (!_matched) {
      if (op instanceof RelLTE) {
        _matched=true;
        _switchResult = "<=";
      }
    }
    if (!_matched) {
      if (op instanceof RelGTE) {
        _matched=true;
        _switchResult = ">=";
      }
    }
    return _switchResult;
  }
  
  protected CharSequence _generateExp(final Add x) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExp = this.generateExp(x.getLeft());
    _builder.append(_generateExp);
    _builder.append("+");
    CharSequence _generateExp_1 = this.generateExp(x.getRight());
    _builder.append(_generateExp_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _generateExp(final Sub x) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExp = this.generateExp(x.getLeft());
    _builder.append(_generateExp);
    _builder.append("-");
    CharSequence _generateExp_1 = this.generateExp(x.getRight());
    _builder.append(_generateExp_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _generateExp(final Mul x) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExp = this.generateExp(x.getLeft());
    _builder.append(_generateExp);
    _builder.append("*");
    CharSequence _generateExp_1 = this.generateExp(x.getRight());
    _builder.append(_generateExp_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _generateExp(final Div x) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExp = this.generateExp(x.getLeft());
    _builder.append(_generateExp);
    _builder.append("/");
    CharSequence _generateExp_1 = this.generateExp(x.getRight());
    _builder.append(_generateExp_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _generateExp(final Name x) {
    return x.getVarName().getName();
  }
  
  protected CharSequence _generateExp(final IntExp x) {
    return Integer.toString(x.getValue());
  }
  
  public void generateExternalInterface(final EntityModel em, final IFileSystemAccess2 fsa) {
    String _name = em.getName();
    String _plus = (_name + "/IExternalCode.cs");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("namespace ");
    String _name_1 = em.getName();
    _builder.append(_name_1);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public interface IExternalCode {");
    _builder.newLine();
    {
      Iterable<ExternalDef> _filter = Iterables.<ExternalDef>filter(em.getDeclarations(), ExternalDef.class);
      for(final ExternalDef x : _filter) {
        _builder.append("\t\t");
        _builder.append("public bool ");
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
  
  public void generateControllerFiles(final EntityModel em, final IFileSystemAccess2 fsa) {
    final Consumer<Controller> _function = (Controller it) -> {
      this.generateController(it, fsa);
    };
    Iterables.<Controller>filter(em.getDeclarations(), Controller.class).forEach(_function);
  }
  
  public void generateController(final Controller controller, final IFileSystemAccess2 fsa) {
    final EntityModel model = EcoreUtil2.<EntityModel>getContainerOfType(controller, EntityModel.class);
    String _name = model.getName();
    String _plus = (_name + "/Controllers/");
    String _name_1 = controller.getName();
    String _plus_1 = (_plus + _name_1);
    String _plus_2 = (_plus_1 + ".cs");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("using EmTest.Models;");
    _builder.newLine();
    _builder.append("using Microsoft.AspNetCore.Http;");
    _builder.newLine();
    _builder.append("using Microsoft.AspNetCore.Mvc;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("namespace ");
    String _name_2 = model.getName();
    _builder.append(_name_2);
    _builder.append(".Controllers {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("[Route(\"api/[controller]\")]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("[Produces(\"application/json\")]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("[Consumes(\"application/json\")]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class ");
    String _name_3 = controller.getName();
    _builder.append(_name_3, "\t");
    _builder.append(" : ControllerBase {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    CharSequence _generateControllerConstructor = this.generateControllerConstructor(controller);
    _builder.append(_generateControllerConstructor, "\t\t");
    _builder.newLineIfNotEmpty();
    {
      EList<ControllerMethod> _methods = controller.getMethods();
      for(final ControllerMethod x : _methods) {
        _builder.append("\t\t");
        CharSequence _generateControllerMethod = this.generateControllerMethod(x, controller.getEntity());
        _builder.append(_generateControllerMethod, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<ControllerMethod> _methods_1 = controller.getMethods();
      for(final ControllerMethod x_1 : _methods_1) {
        _builder.append("\t");
        CharSequence _generateControllerParameters = this.generateControllerParameters(x_1, controller.getEntity());
        _builder.append(_generateControllerParameters, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(_plus_2, _builder);
  }
  
  public CharSequence generateControllerConstructor(final Controller controller) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private readonly IExternalCode ExternalCode;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    String _name = controller.getName();
    _builder.append(_name);
    _builder.append("(IExternalCode externalCode)");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ExternalCode = externalCode;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateControllerMethod(final CreateMethod method, final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[HttpPost]");
    _builder.newLine();
    _builder.append("[ProducesResponseType(StatusCodes.Status201Created)]");
    _builder.newLine();
    _builder.append("public ActionResult<");
    String _name = entity.getName();
    _builder.append(_name);
    _builder.append("> Create(Create");
    String _name_1 = entity.getName();
    _builder.append(_name_1);
    _builder.append("Parameters parameters)");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return new ");
    String _name_2 = entity.getName();
    _builder.append(_name_2, "\t");
    _builder.append("(");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("ExternalCode");
    {
      int _size = entity.getAttributes().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append(", ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Attribute> _attributes = entity.getAttributes();
      boolean _hasElements = false;
      for(final Attribute x : _attributes) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "\t\t");
        }
        _builder.append("\t\t");
        _builder.append("parameters.");
        String _name_3 = x.getName();
        _builder.append(_name_3, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append(");");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateControllerMethod(final GetMethod method, final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//GetMethod!");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateControllerMethod(final ListMethod method, final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//ListMethod!");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateControllerMethod(final UpdateMethod method, final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//UpdateMethod!");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateControllerMethod(final DeleteMethod method, final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//DeleteMethod!");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateControllerParameters(final CreateMethod method, final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class Create");
    String _name = entity.getName();
    _builder.append(_name);
    _builder.append("Parameters {");
    _builder.newLineIfNotEmpty();
    {
      EList<Attribute> _attributes = entity.getAttributes();
      for(final Attribute x : _attributes) {
        _builder.append("\t");
        _builder.append("public ");
        String _name_1 = x.getType().getName();
        _builder.append(_name_1, "\t");
        _builder.append(" ");
        String _name_2 = x.getName();
        _builder.append(_name_2, "\t");
        _builder.append(" { get; set; }");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateControllerParameters(final GetMethod method, final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//GetMethod!");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateControllerParameters(final ListMethod method, final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//ListMethod!");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateControllerParameters(final UpdateMethod method, final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//UpdateMethod!");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateControllerParameters(final DeleteMethod method, final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//DeleteMethod!");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateAttributeRequirement(final EObject requirement, final Attribute attribute) {
    if (requirement instanceof AttributeRequirement) {
      return _generateAttributeRequirement((AttributeRequirement)requirement, attribute);
    } else if (requirement instanceof ExternalUse) {
      return _generateAttributeRequirement((ExternalUse)requirement, attribute);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(requirement, attribute).toString());
    }
  }
  
  public CharSequence generateLogic(final Proposition x) {
    if (x instanceof Comparison) {
      return _generateLogic((Comparison)x);
    } else if (x instanceof Conjunction) {
      return _generateLogic((Conjunction)x);
    } else if (x instanceof Disjunction) {
      return _generateLogic((Disjunction)x);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(x).toString());
    }
  }
  
  public CharSequence generateExp(final Expression x) {
    if (x instanceof Add) {
      return _generateExp((Add)x);
    } else if (x instanceof Div) {
      return _generateExp((Div)x);
    } else if (x instanceof IntExp) {
      return _generateExp((IntExp)x);
    } else if (x instanceof Mul) {
      return _generateExp((Mul)x);
    } else if (x instanceof Name) {
      return _generateExp((Name)x);
    } else if (x instanceof Sub) {
      return _generateExp((Sub)x);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(x).toString());
    }
  }
  
  public CharSequence generateControllerMethod(final ControllerMethod method, final Entity entity) {
    if (method instanceof CreateMethod) {
      return _generateControllerMethod((CreateMethod)method, entity);
    } else if (method instanceof DeleteMethod) {
      return _generateControllerMethod((DeleteMethod)method, entity);
    } else if (method instanceof GetMethod) {
      return _generateControllerMethod((GetMethod)method, entity);
    } else if (method instanceof ListMethod) {
      return _generateControllerMethod((ListMethod)method, entity);
    } else if (method instanceof UpdateMethod) {
      return _generateControllerMethod((UpdateMethod)method, entity);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(method, entity).toString());
    }
  }
  
  public CharSequence generateControllerParameters(final ControllerMethod method, final Entity entity) {
    if (method instanceof CreateMethod) {
      return _generateControllerParameters((CreateMethod)method, entity);
    } else if (method instanceof DeleteMethod) {
      return _generateControllerParameters((DeleteMethod)method, entity);
    } else if (method instanceof GetMethod) {
      return _generateControllerParameters((GetMethod)method, entity);
    } else if (method instanceof ListMethod) {
      return _generateControllerParameters((ListMethod)method, entity);
    } else if (method instanceof UpdateMethod) {
      return _generateControllerParameters((UpdateMethod)method, entity);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(method, entity).toString());
    }
  }
}
