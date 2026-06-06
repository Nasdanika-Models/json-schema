/**
 */
package org.nasdanika.models.json.schema.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.json.schema.Schema;
import org.nasdanika.models.json.schema.SchemaEntry;
import org.nasdanika.models.json.schema.SchemaFactory;
import org.nasdanika.models.json.schema.SchemaPackage;
import org.nasdanika.models.json.schema.StringListEntry;
import org.nasdanika.models.json.schema.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaPackageImpl extends EPackageImpl implements SchemaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringListEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.json.schema.SchemaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchemaPackageImpl() {
		super(eNS_URI, SchemaFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SchemaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchemaPackage init() {
		if (isInited) return (SchemaPackage)EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSchemaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SchemaPackageImpl theSchemaPackage = registeredSchemaPackage instanceof SchemaPackageImpl ? (SchemaPackageImpl)registeredSchemaPackage : new SchemaPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSchemaPackage.createPackageContents();

		// Initialize created meta-data
		theSchemaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSchemaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchemaPackage.eNS_URI, theSchemaPackage);
		return theSchemaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_SchemaVersion() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Id() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Anchor() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_DynamicAnchor() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Ref() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_DynamicRef() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Comment() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_Defs() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_BooleanValue() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Types() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Const() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Enum() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Minimum() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Maximum() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_ExclusiveMinimum() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_ExclusiveMaximum() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_MultipleOf() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_MinLength() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_MaxLength() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Pattern() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_MinItems() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_MaxItems() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_UniqueItems() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_MinContains() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_MaxContains() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Required() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_MinProperties() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_MaxProperties() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_DependentRequired() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_AllOf() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_AnyOf() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_OneOf() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_Not() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_If() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_Then() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_Else() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_Properties() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_PatternProperties() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_AdditionalProperties() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_AdditionalPropertiesBoolean() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_UnevaluatedProperties() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_UnevaluatedPropertiesBoolean() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_DependentSchemas() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_Items() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_ItemsBoolean() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_PrefixItems() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_Contains() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_UnevaluatedItems() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Title() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Description() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Default() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Deprecated() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_ReadOnly() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_WriteOnly() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Examples() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Format() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_ContentEncoding() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_ContentMediaType() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_ContentSchema() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchemaEntry() {
		return schemaEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchemaEntry_Key() {
		return (EAttribute)schemaEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaEntry_Value() {
		return (EReference)schemaEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringListEntry() {
		return stringListEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringListEntry_Key() {
		return (EAttribute)stringListEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringListEntry_Values() {
		return (EAttribute)stringListEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaFactory getSchemaFactory() {
		return (SchemaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
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

		// Create enums
		typeEEnum = createEEnum(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchema_SchemaVersion(), ecorePackage.getEString(), "schemaVersion", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Id(), ecorePackage.getEString(), "id", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Anchor(), ecorePackage.getEString(), "anchor", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_DynamicAnchor(), ecorePackage.getEString(), "dynamicAnchor", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_DynamicRef(), ecorePackage.getEString(), "dynamicRef", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Defs(), this.getSchemaEntry(), null, "defs", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_BooleanValue(), ecorePackage.getEBooleanObject(), "booleanValue", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Types(), this.getType(), "types", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getSchema_DependentRequired(), this.getStringListEntry(), null, "dependentRequired", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_AllOf(), this.getSchema(), null, "allOf", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_AnyOf(), this.getSchema(), null, "anyOf", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_OneOf(), this.getSchema(), null, "oneOf", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Not(), this.getSchema(), null, "not", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_If(), this.getSchema(), null, "if", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Then(), this.getSchema(), null, "then", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Else(), this.getSchema(), null, "else", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Properties(), this.getSchemaEntry(), null, "properties", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_PatternProperties(), this.getSchemaEntry(), null, "patternProperties", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_AdditionalProperties(), this.getSchema(), null, "additionalProperties", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_AdditionalPropertiesBoolean(), ecorePackage.getEBooleanObject(), "additionalPropertiesBoolean", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_UnevaluatedProperties(), this.getSchema(), null, "unevaluatedProperties", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_UnevaluatedPropertiesBoolean(), ecorePackage.getEBooleanObject(), "unevaluatedPropertiesBoolean", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_DependentSchemas(), this.getSchemaEntry(), null, "dependentSchemas", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Items(), this.getSchema(), null, "items", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_ItemsBoolean(), ecorePackage.getEBooleanObject(), "itemsBoolean", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_PrefixItems(), this.getSchema(), null, "prefixItems", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Contains(), this.getSchema(), null, "contains", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_UnevaluatedItems(), this.getSchema(), null, "unevaluatedItems", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getSchema_ContentSchema(), this.getSchema(), null, "contentSchema", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaEntryEClass, SchemaEntry.class, "SchemaEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchemaEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, SchemaEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaEntry_Value(), this.getSchema(), null, "value", null, 0, 1, SchemaEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringListEntryEClass, StringListEntry.class, "StringListEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringListEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, StringListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringListEntry_Values(), ecorePackage.getEString(), "values", null, 0, -1, StringListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.OBJECT);
		addEEnumLiteral(typeEEnum, Type.ARRAY);
		addEEnumLiteral(typeEEnum, Type.STRING);
		addEEnumLiteral(typeEEnum, Type.NUMBER);
		addEEnumLiteral(typeEEnum, Type.INTEGER);
		addEEnumLiteral(typeEEnum, Type.BOOLEAN);
		addEEnumLiteral(typeEEnum, Type.NULL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (schemaEClass,
		   source,
		   new String[] {
			   "documentation", "Represents a JSON Schema 2020-12 schema object. All features are optional."
		   });
		addAnnotation
		  (getSchema_SchemaVersion(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: $schema. The meta-schema URI identifying the JSON Schema dialect."
		   });
		addAnnotation
		  (getSchema_Id(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: $id. The identifier URI for the schema."
		   });
		addAnnotation
		  (getSchema_Anchor(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: $anchor. A plain-name anchor identifier."
		   });
		addAnnotation
		  (getSchema_DynamicAnchor(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: $dynamicAnchor. A dynamic anchor identifier."
		   });
		addAnnotation
		  (getSchema_Ref(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: $ref. A JSON Pointer reference to another schema."
		   });
		addAnnotation
		  (getSchema_DynamicRef(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: $dynamicRef. A dynamic reference to another schema."
		   });
		addAnnotation
		  (getSchema_Comment(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: $comment. A comment for schema authors."
		   });
		addAnnotation
		  (getSchema_Defs(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: $defs. Schema definitions (reusable sub-schemas)."
		   });
		addAnnotation
		  (getSchema_BooleanValue(),
		   source,
		   new String[] {
			   "documentation", "When non-null, the schema is a boolean schema (true or false). Null means it is an object schema."
		   });
		addAnnotation
		  (getSchema_Types(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: type. List of allowed JSON types."
		   });
		addAnnotation
		  (getSchema_Const(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: const. Constant value as a JSON string representation."
		   });
		addAnnotation
		  (getSchema_Enum(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: enum. Enumerated values as JSON string representations."
		   });
		addAnnotation
		  (getSchema_Minimum(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: minimum. Inclusive minimum value for numeric types."
		   });
		addAnnotation
		  (getSchema_Maximum(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: maximum. Inclusive maximum value for numeric types."
		   });
		addAnnotation
		  (getSchema_ExclusiveMinimum(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: exclusiveMinimum. Exclusive minimum value for numeric types."
		   });
		addAnnotation
		  (getSchema_ExclusiveMaximum(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: exclusiveMaximum. Exclusive maximum value for numeric types."
		   });
		addAnnotation
		  (getSchema_MultipleOf(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: multipleOf. The value must be a multiple of this number."
		   });
		addAnnotation
		  (getSchema_MinLength(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: minLength. Minimum string length."
		   });
		addAnnotation
		  (getSchema_MaxLength(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: maxLength. Maximum string length."
		   });
		addAnnotation
		  (getSchema_Pattern(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: pattern. Regular expression pattern for string validation."
		   });
		addAnnotation
		  (getSchema_MinItems(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: minItems. Minimum number of array items."
		   });
		addAnnotation
		  (getSchema_MaxItems(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: maxItems. Maximum number of array items."
		   });
		addAnnotation
		  (getSchema_UniqueItems(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: uniqueItems. Whether array items must be unique."
		   });
		addAnnotation
		  (getSchema_MinContains(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: minContains. Minimum number of items matching the contains schema."
		   });
		addAnnotation
		  (getSchema_MaxContains(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: maxContains. Maximum number of items matching the contains schema."
		   });
		addAnnotation
		  (getSchema_Required(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: required. List of required property names."
		   });
		addAnnotation
		  (getSchema_MinProperties(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: minProperties. Minimum number of object properties."
		   });
		addAnnotation
		  (getSchema_MaxProperties(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: maxProperties. Maximum number of object properties."
		   });
		addAnnotation
		  (getSchema_DependentRequired(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: dependentRequired. Maps property names to required dependencies."
		   });
		addAnnotation
		  (getSchema_AllOf(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: allOf. The instance must be valid against all sub-schemas."
		   });
		addAnnotation
		  (getSchema_AnyOf(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: anyOf. The instance must be valid against at least one sub-schema."
		   });
		addAnnotation
		  (getSchema_OneOf(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: oneOf. The instance must be valid against exactly one sub-schema."
		   });
		addAnnotation
		  (getSchema_Not(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: not. The instance must NOT be valid against this schema."
		   });
		addAnnotation
		  (getSchema_If(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: if. Conditional schema - if this schema validates successfully, then apply \'then\'."
		   });
		addAnnotation
		  (getSchema_Then(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: then. Applied when \'if\' passes validation."
		   });
		addAnnotation
		  (getSchema_Else(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: else. Applied when \'if\' fails validation."
		   });
		addAnnotation
		  (getSchema_Properties(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: properties. Schemas for specific object properties."
		   });
		addAnnotation
		  (getSchema_PatternProperties(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: patternProperties. Schemas for properties matching regex patterns."
		   });
		addAnnotation
		  (getSchema_AdditionalProperties(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: additionalProperties (schema). Schema for properties not covered by \'properties\' or \'patternProperties\'."
		   });
		addAnnotation
		  (getSchema_AdditionalPropertiesBoolean(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: additionalProperties (boolean). Boolean value for additionalProperties."
		   });
		addAnnotation
		  (getSchema_UnevaluatedProperties(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: unevaluatedProperties (schema). Schema for properties not evaluated by adjacent keywords."
		   });
		addAnnotation
		  (getSchema_UnevaluatedPropertiesBoolean(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: unevaluatedProperties (boolean). Boolean value for unevaluatedProperties."
		   });
		addAnnotation
		  (getSchema_DependentSchemas(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: dependentSchemas. Schemas applied when specific properties are present."
		   });
		addAnnotation
		  (getSchema_Items(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: items (schema). Schema for array items (applied to items beyond prefixItems)."
		   });
		addAnnotation
		  (getSchema_ItemsBoolean(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: items (boolean). Boolean value for items."
		   });
		addAnnotation
		  (getSchema_PrefixItems(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: prefixItems. Schemas for the prefix of array items (positional validation)."
		   });
		addAnnotation
		  (getSchema_Contains(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: contains. At least one array item must match this schema."
		   });
		addAnnotation
		  (getSchema_UnevaluatedItems(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: unevaluatedItems. Schema for array items not evaluated by prefixItems or contains."
		   });
		addAnnotation
		  (getSchema_Title(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: title. Human-readable short title for the schema."
		   });
		addAnnotation
		  (getSchema_Description(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: description. Human-readable description of the schema."
		   });
		addAnnotation
		  (getSchema_Default(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: default. Default value as a JSON string representation."
		   });
		addAnnotation
		  (getSchema_Deprecated(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: deprecated. Indicates the schema or value is deprecated."
		   });
		addAnnotation
		  (getSchema_ReadOnly(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: readOnly. Indicates the value is read-only."
		   });
		addAnnotation
		  (getSchema_WriteOnly(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: writeOnly. Indicates the value is write-only."
		   });
		addAnnotation
		  (getSchema_Examples(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: examples. Example values as JSON string representations."
		   });
		addAnnotation
		  (getSchema_Format(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: format. Format identifier (e.g., \'date-time\', \'email\', \'uri\')."
		   });
		addAnnotation
		  (getSchema_ContentEncoding(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: contentEncoding. Content encoding (e.g., \'base64\')."
		   });
		addAnnotation
		  (getSchema_ContentMediaType(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: contentMediaType. Media type of the content (e.g., \'application/json\')."
		   });
		addAnnotation
		  (getSchema_ContentSchema(),
		   source,
		   new String[] {
			   "documentation", "JSON Schema keyword: contentSchema. Schema for the decoded content."
		   });
		addAnnotation
		  (schemaEntryEClass,
		   source,
		   new String[] {
			   "documentation", "A map entry mapping a string key to a Schema. Used for properties, patternProperties, dependentSchemas, and $defs."
		   });
		addAnnotation
		  (getSchemaEntry_Key(),
		   source,
		   new String[] {
			   "documentation", "The key (property name, pattern, or definition name)."
		   });
		addAnnotation
		  (getSchemaEntry_Value(),
		   source,
		   new String[] {
			   "documentation", "The schema value associated with the key."
		   });
		addAnnotation
		  (stringListEntryEClass,
		   source,
		   new String[] {
			   "documentation", "A map entry mapping a string key to a list of strings. Used for dependentRequired."
		   });
		addAnnotation
		  (getStringListEntry_Key(),
		   source,
		   new String[] {
			   "documentation", "The property name."
		   });
		addAnnotation
		  (getStringListEntry_Values(),
		   source,
		   new String[] {
			   "documentation", "The list of required property names that depend on the key property."
		   });
		addAnnotation
		  (typeEEnum,
		   source,
		   new String[] {
			   "documentation", "JSON Schema primitive types."
		   });
		addAnnotation
		  (typeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "JSON object type."
		   });
		addAnnotation
		  (typeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "JSON array type."
		   });
		addAnnotation
		  (typeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "JSON string type."
		   });
		addAnnotation
		  (typeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "JSON number type."
		   });
		addAnnotation
		  (typeEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "JSON integer type."
		   });
		addAnnotation
		  (typeEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "JSON boolean type."
		   });
		addAnnotation
		  (typeEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "JSON null type."
		   });
	}

} //SchemaPackageImpl
