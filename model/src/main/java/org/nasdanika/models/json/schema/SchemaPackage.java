/**
 */
package org.nasdanika.models.json.schema;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.json.schema.SchemaFactory
 * @model kind="package"
 * @generated
 */
public interface SchemaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schema";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/json/schema";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.json.schema";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchemaPackage eINSTANCE = org.nasdanika.models.json.schema.impl.SchemaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.json.schema.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.json.schema.impl.SchemaImpl
	 * @see org.nasdanika.models.json.schema.impl.SchemaPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__SCHEMA_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ID = 1;

	/**
	 * The feature id for the '<em><b>Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ANCHOR = 2;

	/**
	 * The feature id for the '<em><b>Dynamic Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DYNAMIC_ANCHOR = 3;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__REF = 4;

	/**
	 * The feature id for the '<em><b>Dynamic Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DYNAMIC_REF = 5;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__COMMENT = 6;

	/**
	 * The feature id for the '<em><b>Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DEFS = 7;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__BOOLEAN_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TYPES = 9;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__CONST = 10;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ENUM = 11;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MINIMUM = 12;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MAXIMUM = 13;

	/**
	 * The feature id for the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__EXCLUSIVE_MINIMUM = 14;

	/**
	 * The feature id for the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__EXCLUSIVE_MAXIMUM = 15;

	/**
	 * The feature id for the '<em><b>Multiple Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MULTIPLE_OF = 16;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MIN_LENGTH = 17;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MAX_LENGTH = 18;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__PATTERN = 19;

	/**
	 * The feature id for the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MIN_ITEMS = 20;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MAX_ITEMS = 21;

	/**
	 * The feature id for the '<em><b>Unique Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__UNIQUE_ITEMS = 22;

	/**
	 * The feature id for the '<em><b>Min Contains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MIN_CONTAINS = 23;

	/**
	 * The feature id for the '<em><b>Max Contains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MAX_CONTAINS = 24;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__REQUIRED = 25;

	/**
	 * The feature id for the '<em><b>Min Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MIN_PROPERTIES = 26;

	/**
	 * The feature id for the '<em><b>Max Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MAX_PROPERTIES = 27;

	/**
	 * The feature id for the '<em><b>Dependent Required</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DEPENDENT_REQUIRED = 28;

	/**
	 * The feature id for the '<em><b>All Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ALL_OF = 29;

	/**
	 * The feature id for the '<em><b>Any Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ANY_OF = 30;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ONE_OF = 31;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NOT = 32;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__IF = 33;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__THEN = 34;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ELSE = 35;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__PROPERTIES = 36;

	/**
	 * The feature id for the '<em><b>Pattern Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__PATTERN_PROPERTIES = 37;

	/**
	 * The feature id for the '<em><b>Additional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ADDITIONAL_PROPERTIES = 38;

	/**
	 * The feature id for the '<em><b>Additional Properties Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN = 39;

	/**
	 * The feature id for the '<em><b>Unevaluated Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__UNEVALUATED_PROPERTIES = 40;

	/**
	 * The feature id for the '<em><b>Unevaluated Properties Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN = 41;

	/**
	 * The feature id for the '<em><b>Dependent Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DEPENDENT_SCHEMAS = 42;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ITEMS = 43;

	/**
	 * The feature id for the '<em><b>Items Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ITEMS_BOOLEAN = 44;

	/**
	 * The feature id for the '<em><b>Prefix Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__PREFIX_ITEMS = 45;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__CONTAINS = 46;

	/**
	 * The feature id for the '<em><b>Unevaluated Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__UNEVALUATED_ITEMS = 47;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TITLE = 48;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DESCRIPTION = 49;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DEFAULT = 50;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DEPRECATED = 51;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__READ_ONLY = 52;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__WRITE_ONLY = 53;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__EXAMPLES = 54;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__FORMAT = 55;

	/**
	 * The feature id for the '<em><b>Content Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__CONTENT_ENCODING = 56;

	/**
	 * The feature id for the '<em><b>Content Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__CONTENT_MEDIA_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Content Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__CONTENT_SCHEMA = 58;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 59;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.json.schema.impl.SchemaEntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.json.schema.impl.SchemaEntryImpl
	 * @see org.nasdanika.models.json.schema.impl.SchemaPackageImpl#getSchemaEntry()
	 * @generated
	 */
	int SCHEMA_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.json.schema.impl.StringListEntryImpl <em>String List Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.json.schema.impl.StringListEntryImpl
	 * @see org.nasdanika.models.json.schema.impl.SchemaPackageImpl#getStringListEntry()
	 * @generated
	 */
	int STRING_LIST_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_ENTRY__VALUES = 1;

	/**
	 * The number of structural features of the '<em>String List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.json.schema.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.json.schema.Type
	 * @see org.nasdanika.models.json.schema.impl.SchemaPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 3;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.json.schema.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see org.nasdanika.models.json.schema.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getSchemaVersion()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_SchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getId()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getAnchor()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Anchor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getDynamicAnchor <em>Dynamic Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Anchor</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getDynamicAnchor()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_DynamicAnchor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getRef()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getDynamicRef <em>Dynamic Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Ref</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getDynamicRef()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_DynamicRef();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getComment()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.json.schema.Schema#getDefs <em>Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defs</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getDefs()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Defs();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getBooleanValue()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_BooleanValue();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.json.schema.Schema#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Types</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getTypes()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Types();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getConst <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Const</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getConst()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Const();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.json.schema.Schema#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getEnum()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Enum();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getMinimum()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getMaximum()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getExclusiveMinimum <em>Exclusive Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Minimum</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getExclusiveMinimum()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_ExclusiveMinimum();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getExclusiveMaximum <em>Exclusive Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Maximum</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getExclusiveMaximum()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_ExclusiveMaximum();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getMultipleOf <em>Multiple Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Of</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getMultipleOf()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_MultipleOf();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getMinLength()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getMaxLength()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getPattern()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getMinItems <em>Min Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Items</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getMinItems()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_MinItems();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getMaxItems <em>Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Items</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getMaxItems()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_MaxItems();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getUniqueItems <em>Unique Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Items</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getUniqueItems()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_UniqueItems();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getMinContains <em>Min Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Contains</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getMinContains()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_MinContains();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getMaxContains <em>Max Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Contains</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getMaxContains()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_MaxContains();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.json.schema.Schema#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getRequired()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getMinProperties <em>Min Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Properties</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getMinProperties()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_MinProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getMaxProperties <em>Max Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Properties</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getMaxProperties()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_MaxProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.json.schema.Schema#getDependentRequired <em>Dependent Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Required</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getDependentRequired()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_DependentRequired();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.json.schema.Schema#getAllOf <em>All Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Of</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getAllOf()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_AllOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.json.schema.Schema#getAnyOf <em>Any Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Of</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getAnyOf()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_AnyOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.json.schema.Schema#getOneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One Of</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getOneOf()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_OneOf();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.json.schema.Schema#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getNot()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Not();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.json.schema.Schema#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getIf()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.json.schema.Schema#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getThen()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Then();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.json.schema.Schema#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getElse()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Else();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.json.schema.Schema#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getProperties()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.json.schema.Schema#getPatternProperties <em>Pattern Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pattern Properties</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getPatternProperties()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_PatternProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.json.schema.Schema#getAdditionalProperties <em>Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Properties</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getAdditionalProperties()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_AdditionalProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getAdditionalPropertiesBoolean <em>Additional Properties Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Properties Boolean</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getAdditionalPropertiesBoolean()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_AdditionalPropertiesBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.json.schema.Schema#getUnevaluatedProperties <em>Unevaluated Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unevaluated Properties</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getUnevaluatedProperties()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_UnevaluatedProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getUnevaluatedPropertiesBoolean <em>Unevaluated Properties Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unevaluated Properties Boolean</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getUnevaluatedPropertiesBoolean()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_UnevaluatedPropertiesBoolean();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.json.schema.Schema#getDependentSchemas <em>Dependent Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Schemas</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getDependentSchemas()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_DependentSchemas();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.json.schema.Schema#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getItems()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Items();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getItemsBoolean <em>Items Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Items Boolean</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getItemsBoolean()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_ItemsBoolean();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.json.schema.Schema#getPrefixItems <em>Prefix Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prefix Items</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getPrefixItems()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_PrefixItems();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.json.schema.Schema#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getContains()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Contains();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.json.schema.Schema#getUnevaluatedItems <em>Unevaluated Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unevaluated Items</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getUnevaluatedItems()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_UnevaluatedItems();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getTitle()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getDescription()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getDefault()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deprecated</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getDeprecated()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Deprecated();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getReadOnly()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getWriteOnly <em>Write Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Only</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getWriteOnly()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_WriteOnly();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.json.schema.Schema#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Examples</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getExamples()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Examples();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getFormat()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getContentEncoding <em>Content Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Encoding</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getContentEncoding()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_ContentEncoding();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.Schema#getContentMediaType <em>Content Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Media Type</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getContentMediaType()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_ContentMediaType();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.json.schema.Schema#getContentSchema <em>Content Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Schema</em>'.
	 * @see org.nasdanika.models.json.schema.Schema#getContentSchema()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_ContentSchema();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.json.schema.SchemaEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see org.nasdanika.models.json.schema.SchemaEntry
	 * @generated
	 */
	EClass getSchemaEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.SchemaEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.nasdanika.models.json.schema.SchemaEntry#getKey()
	 * @see #getSchemaEntry()
	 * @generated
	 */
	EAttribute getSchemaEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.json.schema.SchemaEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.nasdanika.models.json.schema.SchemaEntry#getValue()
	 * @see #getSchemaEntry()
	 * @generated
	 */
	EReference getSchemaEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.json.schema.StringListEntry <em>String List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String List Entry</em>'.
	 * @see org.nasdanika.models.json.schema.StringListEntry
	 * @generated
	 */
	EClass getStringListEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.json.schema.StringListEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.nasdanika.models.json.schema.StringListEntry#getKey()
	 * @see #getStringListEntry()
	 * @generated
	 */
	EAttribute getStringListEntry_Key();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.json.schema.StringListEntry#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.nasdanika.models.json.schema.StringListEntry#getValues()
	 * @see #getStringListEntry()
	 * @generated
	 */
	EAttribute getStringListEntry_Values();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.json.schema.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see org.nasdanika.models.json.schema.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchemaFactory getSchemaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.json.schema.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.json.schema.impl.SchemaImpl
		 * @see org.nasdanika.models.json.schema.impl.SchemaPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__SCHEMA_VERSION = eINSTANCE.getSchema_SchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__ID = eINSTANCE.getSchema_Id();

		/**
		 * The meta object literal for the '<em><b>Anchor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__ANCHOR = eINSTANCE.getSchema_Anchor();

		/**
		 * The meta object literal for the '<em><b>Dynamic Anchor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__DYNAMIC_ANCHOR = eINSTANCE.getSchema_DynamicAnchor();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__REF = eINSTANCE.getSchema_Ref();

		/**
		 * The meta object literal for the '<em><b>Dynamic Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__DYNAMIC_REF = eINSTANCE.getSchema_DynamicRef();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__COMMENT = eINSTANCE.getSchema_Comment();

		/**
		 * The meta object literal for the '<em><b>Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__DEFS = eINSTANCE.getSchema_Defs();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__BOOLEAN_VALUE = eINSTANCE.getSchema_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__TYPES = eINSTANCE.getSchema_Types();

		/**
		 * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__CONST = eINSTANCE.getSchema_Const();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__ENUM = eINSTANCE.getSchema_Enum();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__MINIMUM = eINSTANCE.getSchema_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__MAXIMUM = eINSTANCE.getSchema_Maximum();

		/**
		 * The meta object literal for the '<em><b>Exclusive Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__EXCLUSIVE_MINIMUM = eINSTANCE.getSchema_ExclusiveMinimum();

		/**
		 * The meta object literal for the '<em><b>Exclusive Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__EXCLUSIVE_MAXIMUM = eINSTANCE.getSchema_ExclusiveMaximum();

		/**
		 * The meta object literal for the '<em><b>Multiple Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__MULTIPLE_OF = eINSTANCE.getSchema_MultipleOf();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__MIN_LENGTH = eINSTANCE.getSchema_MinLength();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__MAX_LENGTH = eINSTANCE.getSchema_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__PATTERN = eINSTANCE.getSchema_Pattern();

		/**
		 * The meta object literal for the '<em><b>Min Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__MIN_ITEMS = eINSTANCE.getSchema_MinItems();

		/**
		 * The meta object literal for the '<em><b>Max Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__MAX_ITEMS = eINSTANCE.getSchema_MaxItems();

		/**
		 * The meta object literal for the '<em><b>Unique Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__UNIQUE_ITEMS = eINSTANCE.getSchema_UniqueItems();

		/**
		 * The meta object literal for the '<em><b>Min Contains</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__MIN_CONTAINS = eINSTANCE.getSchema_MinContains();

		/**
		 * The meta object literal for the '<em><b>Max Contains</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__MAX_CONTAINS = eINSTANCE.getSchema_MaxContains();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__REQUIRED = eINSTANCE.getSchema_Required();

		/**
		 * The meta object literal for the '<em><b>Min Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__MIN_PROPERTIES = eINSTANCE.getSchema_MinProperties();

		/**
		 * The meta object literal for the '<em><b>Max Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__MAX_PROPERTIES = eINSTANCE.getSchema_MaxProperties();

		/**
		 * The meta object literal for the '<em><b>Dependent Required</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__DEPENDENT_REQUIRED = eINSTANCE.getSchema_DependentRequired();

		/**
		 * The meta object literal for the '<em><b>All Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__ALL_OF = eINSTANCE.getSchema_AllOf();

		/**
		 * The meta object literal for the '<em><b>Any Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__ANY_OF = eINSTANCE.getSchema_AnyOf();

		/**
		 * The meta object literal for the '<em><b>One Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__ONE_OF = eINSTANCE.getSchema_OneOf();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__NOT = eINSTANCE.getSchema_Not();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__IF = eINSTANCE.getSchema_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__THEN = eINSTANCE.getSchema_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__ELSE = eINSTANCE.getSchema_Else();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__PROPERTIES = eINSTANCE.getSchema_Properties();

		/**
		 * The meta object literal for the '<em><b>Pattern Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__PATTERN_PROPERTIES = eINSTANCE.getSchema_PatternProperties();

		/**
		 * The meta object literal for the '<em><b>Additional Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__ADDITIONAL_PROPERTIES = eINSTANCE.getSchema_AdditionalProperties();

		/**
		 * The meta object literal for the '<em><b>Additional Properties Boolean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN = eINSTANCE.getSchema_AdditionalPropertiesBoolean();

		/**
		 * The meta object literal for the '<em><b>Unevaluated Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__UNEVALUATED_PROPERTIES = eINSTANCE.getSchema_UnevaluatedProperties();

		/**
		 * The meta object literal for the '<em><b>Unevaluated Properties Boolean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN = eINSTANCE.getSchema_UnevaluatedPropertiesBoolean();

		/**
		 * The meta object literal for the '<em><b>Dependent Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__DEPENDENT_SCHEMAS = eINSTANCE.getSchema_DependentSchemas();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__ITEMS = eINSTANCE.getSchema_Items();

		/**
		 * The meta object literal for the '<em><b>Items Boolean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__ITEMS_BOOLEAN = eINSTANCE.getSchema_ItemsBoolean();

		/**
		 * The meta object literal for the '<em><b>Prefix Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__PREFIX_ITEMS = eINSTANCE.getSchema_PrefixItems();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__CONTAINS = eINSTANCE.getSchema_Contains();

		/**
		 * The meta object literal for the '<em><b>Unevaluated Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__UNEVALUATED_ITEMS = eINSTANCE.getSchema_UnevaluatedItems();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__TITLE = eINSTANCE.getSchema_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__DESCRIPTION = eINSTANCE.getSchema_Description();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__DEFAULT = eINSTANCE.getSchema_Default();

		/**
		 * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__DEPRECATED = eINSTANCE.getSchema_Deprecated();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__READ_ONLY = eINSTANCE.getSchema_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Write Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__WRITE_ONLY = eINSTANCE.getSchema_WriteOnly();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__EXAMPLES = eINSTANCE.getSchema_Examples();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__FORMAT = eINSTANCE.getSchema_Format();

		/**
		 * The meta object literal for the '<em><b>Content Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__CONTENT_ENCODING = eINSTANCE.getSchema_ContentEncoding();

		/**
		 * The meta object literal for the '<em><b>Content Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__CONTENT_MEDIA_TYPE = eINSTANCE.getSchema_ContentMediaType();

		/**
		 * The meta object literal for the '<em><b>Content Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__CONTENT_SCHEMA = eINSTANCE.getSchema_ContentSchema();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.json.schema.impl.SchemaEntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.json.schema.impl.SchemaEntryImpl
		 * @see org.nasdanika.models.json.schema.impl.SchemaPackageImpl#getSchemaEntry()
		 * @generated
		 */
		EClass SCHEMA_ENTRY = eINSTANCE.getSchemaEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_ENTRY__KEY = eINSTANCE.getSchemaEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_ENTRY__VALUE = eINSTANCE.getSchemaEntry_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.json.schema.impl.StringListEntryImpl <em>String List Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.json.schema.impl.StringListEntryImpl
		 * @see org.nasdanika.models.json.schema.impl.SchemaPackageImpl#getStringListEntry()
		 * @generated
		 */
		EClass STRING_LIST_ENTRY = eINSTANCE.getStringListEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LIST_ENTRY__KEY = eINSTANCE.getStringListEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LIST_ENTRY__VALUES = eINSTANCE.getStringListEntry_Values();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.json.schema.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.json.schema.Type
		 * @see org.nasdanika.models.json.schema.impl.SchemaPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //SchemaPackage
