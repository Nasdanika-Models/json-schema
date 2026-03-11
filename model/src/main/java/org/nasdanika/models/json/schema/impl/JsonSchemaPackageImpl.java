package org.nasdanika.models.json.schema.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.json.schema.JsonSchemaFactory;
import org.nasdanika.models.json.schema.JsonSchemaPackage;
import org.nasdanika.models.json.schema.Schema;
import org.nasdanika.models.json.schema.SchemaEntry;
import org.nasdanika.models.json.schema.StringListEntry;
import org.nasdanika.models.json.schema.Type;

/**
 * An implementation of the model <b>Package</b>.
 * @generated
 */
public class JsonSchemaPackageImpl extends EPackageImpl implements JsonSchemaPackage {

	private EClass schemaEClass = null;
	private EClass schemaEntryEClass = null;
	private EClass stringListEntryEClass = null;
	private EEnum typeEEnum = null;

	/**
	 * Creates an instance of the model Package.
	 * @generated
	 */
	private JsonSchemaPackageImpl() {
		super(eNS_URI, JsonSchemaFactory.eINSTANCE);
	}

	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the Package for this model.
	 * @generated
	 */
	public static JsonSchemaPackage init() {
		if (isInited) return (JsonSchemaPackage) EPackage.Registry.INSTANCE.getEPackage(JsonSchemaPackage.eNS_URI);

		Object registeredPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JsonSchemaPackageImpl thePackage = registeredPackage instanceof JsonSchemaPackageImpl
				? (JsonSchemaPackageImpl) registeredPackage
				: new JsonSchemaPackageImpl();

		isInited = true;

		thePackage.createPackageContents();
		thePackage.initializePackageContents();
		thePackage.freeze();

		EPackage.Registry.INSTANCE.put(JsonSchemaPackage.eNS_URI, thePackage);
		return thePackage;
	}

	@Override public EClass getSchemaClass() { return schemaEClass; }

	@Override public EAttribute getSchema_SchemaVersion() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__SCHEMA_VERSION); }
	@Override public EAttribute getSchema_Id() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__ID); }
	@Override public EAttribute getSchema_Anchor() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__ANCHOR); }
	@Override public EAttribute getSchema_DynamicAnchor() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__DYNAMIC_ANCHOR); }
	@Override public EAttribute getSchema_Ref() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__REF); }
	@Override public EAttribute getSchema_DynamicRef() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__DYNAMIC_REF); }
	@Override public EAttribute getSchema_Comment() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__COMMENT); }
	@Override public EReference getSchema_Defs() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__DEFS); }
	@Override public EAttribute getSchema_BooleanValue() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__BOOLEAN_VALUE); }
	@Override public EAttribute getSchema_Types() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__TYPES); }
	@Override public EAttribute getSchema_Const() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__CONST); }
	@Override public EAttribute getSchema_Enum() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__ENUM); }
	@Override public EAttribute getSchema_Minimum() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__MINIMUM); }
	@Override public EAttribute getSchema_Maximum() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__MAXIMUM); }
	@Override public EAttribute getSchema_ExclusiveMinimum() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__EXCLUSIVE_MINIMUM); }
	@Override public EAttribute getSchema_ExclusiveMaximum() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__EXCLUSIVE_MAXIMUM); }
	@Override public EAttribute getSchema_MultipleOf() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__MULTIPLE_OF); }
	@Override public EAttribute getSchema_MinLength() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__MIN_LENGTH); }
	@Override public EAttribute getSchema_MaxLength() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__MAX_LENGTH); }
	@Override public EAttribute getSchema_Pattern() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__PATTERN); }
	@Override public EAttribute getSchema_MinItems() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__MIN_ITEMS); }
	@Override public EAttribute getSchema_MaxItems() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__MAX_ITEMS); }
	@Override public EAttribute getSchema_UniqueItems() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__UNIQUE_ITEMS); }
	@Override public EAttribute getSchema_MinContains() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__MIN_CONTAINS); }
	@Override public EAttribute getSchema_MaxContains() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__MAX_CONTAINS); }
	@Override public EAttribute getSchema_Required() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__REQUIRED); }
	@Override public EAttribute getSchema_MinProperties() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__MIN_PROPERTIES); }
	@Override public EAttribute getSchema_MaxProperties() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__MAX_PROPERTIES); }
	@Override public EReference getSchema_DependentRequired() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__DEPENDENT_REQUIRED); }
	@Override public EReference getSchema_AllOf() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__ALL_OF); }
	@Override public EReference getSchema_AnyOf() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__ANY_OF); }
	@Override public EReference getSchema_OneOf() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__ONE_OF); }
	@Override public EReference getSchema_Not() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__NOT); }
	@Override public EReference getSchema_If() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__IF); }
	@Override public EReference getSchema_Then() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__THEN); }
	@Override public EReference getSchema_Else() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__ELSE); }
	@Override public EReference getSchema_Properties() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__PROPERTIES); }
	@Override public EReference getSchema_PatternProperties() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__PATTERN_PROPERTIES); }
	@Override public EReference getSchema_AdditionalProperties() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__ADDITIONAL_PROPERTIES); }
	@Override public EAttribute getSchema_AdditionalPropertiesBoolean() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN); }
	@Override public EReference getSchema_UnevaluatedProperties() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__UNEVALUATED_PROPERTIES); }
	@Override public EAttribute getSchema_UnevaluatedPropertiesBoolean() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN); }
	@Override public EReference getSchema_DependentSchemas() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__DEPENDENT_SCHEMAS); }
	@Override public EReference getSchema_Items() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__ITEMS); }
	@Override public EAttribute getSchema_ItemsBoolean() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__ITEMS_BOOLEAN); }
	@Override public EReference getSchema_PrefixItems() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__PREFIX_ITEMS); }
	@Override public EReference getSchema_Contains() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__CONTAINS); }
	@Override public EReference getSchema_UnevaluatedItems() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__UNEVALUATED_ITEMS); }
	@Override public EAttribute getSchema_Title() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__TITLE); }
	@Override public EAttribute getSchema_Description() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__DESCRIPTION); }
	@Override public EAttribute getSchema_Default() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__DEFAULT); }
	@Override public EAttribute getSchema_Deprecated() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__DEPRECATED); }
	@Override public EAttribute getSchema_ReadOnly() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__READ_ONLY); }
	@Override public EAttribute getSchema_WriteOnly() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__WRITE_ONLY); }
	@Override public EAttribute getSchema_Examples() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__EXAMPLES); }
	@Override public EAttribute getSchema_Format() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__FORMAT); }
	@Override public EAttribute getSchema_ContentEncoding() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__CONTENT_ENCODING); }
	@Override public EAttribute getSchema_ContentMediaType() { return (EAttribute) schemaEClass.getEStructuralFeatures().get(SCHEMA__CONTENT_MEDIA_TYPE); }
	@Override public EReference getSchema_ContentSchema() { return (EReference) schemaEClass.getEStructuralFeatures().get(SCHEMA__CONTENT_SCHEMA); }

	@Override public EClass getSchemaEntryClass() { return schemaEntryEClass; }
	@Override public EAttribute getSchemaEntry_Key() { return (EAttribute) schemaEntryEClass.getEStructuralFeatures().get(SCHEMA_ENTRY__KEY); }
	@Override public EReference getSchemaEntry_Value() { return (EReference) schemaEntryEClass.getEStructuralFeatures().get(SCHEMA_ENTRY__VALUE); }

	@Override public EClass getStringListEntryClass() { return stringListEntryEClass; }
	@Override public EAttribute getStringListEntry_Key() { return (EAttribute) stringListEntryEClass.getEStructuralFeatures().get(STRING_LIST_ENTRY__KEY); }
	@Override public EAttribute getStringListEntry_Values() { return (EAttribute) stringListEntryEClass.getEStructuralFeatures().get(STRING_LIST_ENTRY__VALUES); }

	@Override public EEnum getTypeEnum() { return typeEEnum; }

	@Override
	public JsonSchemaFactory getJsonSchemaFactory() {
		return (JsonSchemaFactory) getEFactoryInstance();
	}

	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		schemaEClass = createEClass(SCHEMA);
		createEAttribute(schemaEClass, SCHEMA__SCHEMA_VERSION);
		createEAttribute(schemaEClass, SCHEMA__ID);
		createEAttribute(schemaEClass, SCHEMA__ANCHOR);
		createEAttribute(schemaEClass, SCHEMA__DYNAMIC_ANCHOR);
		createEAttribute(schemaEClass, SCHEMA__REF);
		createEAttribute(schemaEClass, SCHEMA__DYNAMIC_REF);
		createEAttribute(schemaEClass, SCHEMA__COMMENT);
		createEReference(schemaEClass, SCHEMA__DEFS);
		createEAttribute(schemaEClass, SCHEMA__BOOLEAN_VALUE);
		createEAttribute(schemaEClass, SCHEMA__TYPES);
		createEAttribute(schemaEClass, SCHEMA__CONST);
		createEAttribute(schemaEClass, SCHEMA__ENUM);
		createEAttribute(schemaEClass, SCHEMA__MINIMUM);
		createEAttribute(schemaEClass, SCHEMA__MAXIMUM);
		createEAttribute(schemaEClass, SCHEMA__EXCLUSIVE_MINIMUM);
		createEAttribute(schemaEClass, SCHEMA__EXCLUSIVE_MAXIMUM);
		createEAttribute(schemaEClass, SCHEMA__MULTIPLE_OF);
		createEAttribute(schemaEClass, SCHEMA__MIN_LENGTH);
		createEAttribute(schemaEClass, SCHEMA__MAX_LENGTH);
		createEAttribute(schemaEClass, SCHEMA__PATTERN);
		createEAttribute(schemaEClass, SCHEMA__MIN_ITEMS);
		createEAttribute(schemaEClass, SCHEMA__MAX_ITEMS);
		createEAttribute(schemaEClass, SCHEMA__UNIQUE_ITEMS);
		createEAttribute(schemaEClass, SCHEMA__MIN_CONTAINS);
		createEAttribute(schemaEClass, SCHEMA__MAX_CONTAINS);
		createEAttribute(schemaEClass, SCHEMA__REQUIRED);
		createEAttribute(schemaEClass, SCHEMA__MIN_PROPERTIES);
		createEAttribute(schemaEClass, SCHEMA__MAX_PROPERTIES);
		createEReference(schemaEClass, SCHEMA__DEPENDENT_REQUIRED);
		createEReference(schemaEClass, SCHEMA__ALL_OF);
		createEReference(schemaEClass, SCHEMA__ANY_OF);
		createEReference(schemaEClass, SCHEMA__ONE_OF);
		createEReference(schemaEClass, SCHEMA__NOT);
		createEReference(schemaEClass, SCHEMA__IF);
		createEReference(schemaEClass, SCHEMA__THEN);
		createEReference(schemaEClass, SCHEMA__ELSE);
		createEReference(schemaEClass, SCHEMA__PROPERTIES);
		createEReference(schemaEClass, SCHEMA__PATTERN_PROPERTIES);
		createEReference(schemaEClass, SCHEMA__ADDITIONAL_PROPERTIES);
		createEAttribute(schemaEClass, SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN);
		createEReference(schemaEClass, SCHEMA__UNEVALUATED_PROPERTIES);
		createEAttribute(schemaEClass, SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN);
		createEReference(schemaEClass, SCHEMA__DEPENDENT_SCHEMAS);
		createEReference(schemaEClass, SCHEMA__ITEMS);
		createEAttribute(schemaEClass, SCHEMA__ITEMS_BOOLEAN);
		createEReference(schemaEClass, SCHEMA__PREFIX_ITEMS);
		createEReference(schemaEClass, SCHEMA__CONTAINS);
		createEReference(schemaEClass, SCHEMA__UNEVALUATED_ITEMS);
		createEAttribute(schemaEClass, SCHEMA__TITLE);
		createEAttribute(schemaEClass, SCHEMA__DESCRIPTION);
		createEAttribute(schemaEClass, SCHEMA__DEFAULT);
		createEAttribute(schemaEClass, SCHEMA__DEPRECATED);
		createEAttribute(schemaEClass, SCHEMA__READ_ONLY);
		createEAttribute(schemaEClass, SCHEMA__WRITE_ONLY);
		createEAttribute(schemaEClass, SCHEMA__EXAMPLES);
		createEAttribute(schemaEClass, SCHEMA__FORMAT);
		createEAttribute(schemaEClass, SCHEMA__CONTENT_ENCODING);
		createEAttribute(schemaEClass, SCHEMA__CONTENT_MEDIA_TYPE);
		createEReference(schemaEClass, SCHEMA__CONTENT_SCHEMA);

		schemaEntryEClass = createEClass(SCHEMA_ENTRY);
		createEAttribute(schemaEntryEClass, SCHEMA_ENTRY__KEY);
		createEReference(schemaEntryEClass, SCHEMA_ENTRY__VALUE);

		stringListEntryEClass = createEClass(STRING_LIST_ENTRY);
		createEAttribute(stringListEntryEClass, STRING_LIST_ENTRY__KEY);
		createEAttribute(stringListEntryEClass, STRING_LIST_ENTRY__VALUES);

		typeEEnum = createEEnum(TYPE);
	}

	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchema_SchemaVersion(), ecorePackage.getEString(), "schemaVersion", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Id(), ecorePackage.getEString(), "id", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Anchor(), ecorePackage.getEString(), "anchor", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_DynamicAnchor(), ecorePackage.getEString(), "dynamicAnchor", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_DynamicRef(), ecorePackage.getEString(), "dynamicRef", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Defs(), this.getSchemaEntryClass(), null, "defs", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_BooleanValue(), ecorePackage.getEBooleanObject(), "booleanValue", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Types(), this.getTypeEnum(), "types", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Const(), ecorePackage.getEString(), "const", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Enum(), ecorePackage.getEString(), "enum", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Minimum(), ecorePackage.getEDoubleObject(), "minimum", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Maximum(), ecorePackage.getEDoubleObject(), "maximum", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_ExclusiveMinimum(), ecorePackage.getEDoubleObject(), "exclusiveMinimum", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_ExclusiveMaximum(), ecorePackage.getEDoubleObject(), "exclusiveMaximum", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_MultipleOf(), ecorePackage.getEDoubleObject(), "multipleOf", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_MinLength(), ecorePackage.getEIntegerObject(), "minLength", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_MaxLength(), ecorePackage.getEIntegerObject(), "maxLength", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_MinItems(), ecorePackage.getEIntegerObject(), "minItems", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_MaxItems(), ecorePackage.getEIntegerObject(), "maxItems", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_UniqueItems(), ecorePackage.getEBooleanObject(), "uniqueItems", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_MinContains(), ecorePackage.getEIntegerObject(), "minContains", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_MaxContains(), ecorePackage.getEIntegerObject(), "maxContains", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Required(), ecorePackage.getEString(), "required", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_MinProperties(), ecorePackage.getEIntegerObject(), "minProperties", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_MaxProperties(), ecorePackage.getEIntegerObject(), "maxProperties", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_DependentRequired(), this.getStringListEntryClass(), null, "dependentRequired", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_AllOf(), this.getSchemaClass(), null, "allOf", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_AnyOf(), this.getSchemaClass(), null, "anyOf", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_OneOf(), this.getSchemaClass(), null, "oneOf", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Not(), this.getSchemaClass(), null, "not", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_If(), this.getSchemaClass(), null, "if", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Then(), this.getSchemaClass(), null, "then", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Else(), this.getSchemaClass(), null, "else", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Properties(), this.getSchemaEntryClass(), null, "properties", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_PatternProperties(), this.getSchemaEntryClass(), null, "patternProperties", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_AdditionalProperties(), this.getSchemaClass(), null, "additionalProperties", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_AdditionalPropertiesBoolean(), ecorePackage.getEBooleanObject(), "additionalPropertiesBoolean", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_UnevaluatedProperties(), this.getSchemaClass(), null, "unevaluatedProperties", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_UnevaluatedPropertiesBoolean(), ecorePackage.getEBooleanObject(), "unevaluatedPropertiesBoolean", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_DependentSchemas(), this.getSchemaEntryClass(), null, "dependentSchemas", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Items(), this.getSchemaClass(), null, "items", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_ItemsBoolean(), ecorePackage.getEBooleanObject(), "itemsBoolean", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_PrefixItems(), this.getSchemaClass(), null, "prefixItems", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Contains(), this.getSchemaClass(), null, "contains", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_UnevaluatedItems(), this.getSchemaClass(), null, "unevaluatedItems", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Title(), ecorePackage.getEString(), "title", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Description(), ecorePackage.getEString(), "description", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Default(), ecorePackage.getEString(), "default", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Deprecated(), ecorePackage.getEBooleanObject(), "deprecated", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_ReadOnly(), ecorePackage.getEBooleanObject(), "readOnly", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_WriteOnly(), ecorePackage.getEBooleanObject(), "writeOnly", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Examples(), ecorePackage.getEString(), "examples", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Format(), ecorePackage.getEString(), "format", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_ContentEncoding(), ecorePackage.getEString(), "contentEncoding", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_ContentMediaType(), ecorePackage.getEString(), "contentMediaType", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_ContentSchema(), this.getSchemaClass(), null, "contentSchema", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaEntryEClass, SchemaEntry.class, "SchemaEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchemaEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, SchemaEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaEntry_Value(), this.getSchemaClass(), null, "value", null, 0, 1, SchemaEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringListEntryEClass, StringListEntry.class, "StringListEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringListEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, StringListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringListEntry_Values(), ecorePackage.getEString(), "values", null, 0, -1, StringListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.OBJECT);
		addEEnumLiteral(typeEEnum, Type.ARRAY);
		addEEnumLiteral(typeEEnum, Type.STRING);
		addEEnumLiteral(typeEEnum, Type.NUMBER);
		addEEnumLiteral(typeEEnum, Type.INTEGER);
		addEEnumLiteral(typeEEnum, Type.BOOLEAN);
		addEEnumLiteral(typeEEnum, Type.NULL);
	}

} //JsonSchemaPackageImpl
