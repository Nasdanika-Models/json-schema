/**
 */
package org.nasdanika.models.json.schema.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.json.schema.Schema;
import org.nasdanika.models.json.schema.SchemaEntry;
import org.nasdanika.models.json.schema.SchemaPackage;
import org.nasdanika.models.json.schema.StringListEntry;
import org.nasdanika.models.json.schema.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getDynamicAnchor <em>Dynamic Anchor</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getDynamicRef <em>Dynamic Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getDefs <em>Defs</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getConst <em>Const</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getMultipleOf <em>Multiple Of</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getUniqueItems <em>Unique Items</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getMinContains <em>Min Contains</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getMaxContains <em>Max Contains</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getMinProperties <em>Min Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getMaxProperties <em>Max Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getDependentRequired <em>Dependent Required</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getAllOf <em>All Of</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getAnyOf <em>Any Of</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getOneOf <em>One Of</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getElse <em>Else</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getPatternProperties <em>Pattern Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getAdditionalProperties <em>Additional Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getAdditionalPropertiesBoolean <em>Additional Properties Boolean</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getUnevaluatedProperties <em>Unevaluated Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getUnevaluatedPropertiesBoolean <em>Unevaluated Properties Boolean</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getDependentSchemas <em>Dependent Schemas</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getItemsBoolean <em>Items Boolean</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getPrefixItems <em>Prefix Items</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getUnevaluatedItems <em>Unevaluated Items</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getWriteOnly <em>Write Only</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getContentEncoding <em>Content Encoding</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getContentMediaType <em>Content Media Type</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.SchemaImpl#getContentSchema <em>Content Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends MinimalEObjectImpl.Container implements Schema {
	/**
	 * The default value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAnchor() <em>Anchor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchor()
	 * @generated
	 * @ordered
	 */
	protected static final String ANCHOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDynamicAnchor() <em>Dynamic Anchor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicAnchor()
	 * @generated
	 * @ordered
	 */
	protected static final String DYNAMIC_ANCHOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDynamicRef() <em>Dynamic Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DYNAMIC_REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BOOLEAN_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConst() <em>Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConst()
	 * @generated
	 * @ordered
	 */
	protected static final String CONST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final Double MINIMUM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAXIMUM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExclusiveMinimum() <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final Double EXCLUSIVE_MINIMUM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExclusiveMaximum() <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final Double EXCLUSIVE_MAXIMUM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMultipleOf() <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOf()
	 * @generated
	 * @ordered
	 */
	protected static final Double MULTIPLE_OF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_LENGTH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_LENGTH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_ITEMS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_ITEMS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUniqueItems() <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueItems()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UNIQUE_ITEMS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMinContains() <em>Min Contains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinContains()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_CONTAINS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaxContains() <em>Max Contains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxContains()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_CONTAINS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMinProperties() <em>Min Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinProperties()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_PROPERTIES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaxProperties() <em>Max Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxProperties()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_PROPERTIES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAdditionalPropertiesBoolean() <em>Additional Properties Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalPropertiesBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ADDITIONAL_PROPERTIES_BOOLEAN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUnevaluatedPropertiesBoolean() <em>Unevaluated Properties Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnevaluatedPropertiesBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UNEVALUATED_PROPERTIES_BOOLEAN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getItemsBoolean() <em>Items Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemsBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ITEMS_BOOLEAN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEPRECATED_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean READ_ONLY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWriteOnly() <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WRITE_ONLY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContentEncoding() <em>Content Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_ENCODING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContentMediaType() <em>Content Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_MEDIA_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaVersion() {
		return (String)eDynamicGet(SchemaPackage.SCHEMA__SCHEMA_VERSION, SchemaPackage.Literals.SCHEMA__SCHEMA_VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaVersion(String newSchemaVersion) {
		eDynamicSet(SchemaPackage.SCHEMA__SCHEMA_VERSION, SchemaPackage.Literals.SCHEMA__SCHEMA_VERSION, newSchemaVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(SchemaPackage.SCHEMA__ID, SchemaPackage.Literals.SCHEMA__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(SchemaPackage.SCHEMA__ID, SchemaPackage.Literals.SCHEMA__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnchor() {
		return (String)eDynamicGet(SchemaPackage.SCHEMA__ANCHOR, SchemaPackage.Literals.SCHEMA__ANCHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnchor(String newAnchor) {
		eDynamicSet(SchemaPackage.SCHEMA__ANCHOR, SchemaPackage.Literals.SCHEMA__ANCHOR, newAnchor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDynamicAnchor() {
		return (String)eDynamicGet(SchemaPackage.SCHEMA__DYNAMIC_ANCHOR, SchemaPackage.Literals.SCHEMA__DYNAMIC_ANCHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDynamicAnchor(String newDynamicAnchor) {
		eDynamicSet(SchemaPackage.SCHEMA__DYNAMIC_ANCHOR, SchemaPackage.Literals.SCHEMA__DYNAMIC_ANCHOR, newDynamicAnchor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRef() {
		return (String)eDynamicGet(SchemaPackage.SCHEMA__REF, SchemaPackage.Literals.SCHEMA__REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef(String newRef) {
		eDynamicSet(SchemaPackage.SCHEMA__REF, SchemaPackage.Literals.SCHEMA__REF, newRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDynamicRef() {
		return (String)eDynamicGet(SchemaPackage.SCHEMA__DYNAMIC_REF, SchemaPackage.Literals.SCHEMA__DYNAMIC_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDynamicRef(String newDynamicRef) {
		eDynamicSet(SchemaPackage.SCHEMA__DYNAMIC_REF, SchemaPackage.Literals.SCHEMA__DYNAMIC_REF, newDynamicRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return (String)eDynamicGet(SchemaPackage.SCHEMA__COMMENT, SchemaPackage.Literals.SCHEMA__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		eDynamicSet(SchemaPackage.SCHEMA__COMMENT, SchemaPackage.Literals.SCHEMA__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SchemaEntry> getDefs() {
		return (EList<SchemaEntry>)eDynamicGet(SchemaPackage.SCHEMA__DEFS, SchemaPackage.Literals.SCHEMA__DEFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getBooleanValue() {
		return (Boolean)eDynamicGet(SchemaPackage.SCHEMA__BOOLEAN_VALUE, SchemaPackage.Literals.SCHEMA__BOOLEAN_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBooleanValue(Boolean newBooleanValue) {
		eDynamicSet(SchemaPackage.SCHEMA__BOOLEAN_VALUE, SchemaPackage.Literals.SCHEMA__BOOLEAN_VALUE, newBooleanValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Type> getTypes() {
		return (EList<Type>)eDynamicGet(SchemaPackage.SCHEMA__TYPES, SchemaPackage.Literals.SCHEMA__TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConst() {
		return (String)eDynamicGet(SchemaPackage.SCHEMA__CONST, SchemaPackage.Literals.SCHEMA__CONST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConst(String newConst) {
		eDynamicSet(SchemaPackage.SCHEMA__CONST, SchemaPackage.Literals.SCHEMA__CONST, newConst);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getEnum() {
		return (EList<String>)eDynamicGet(SchemaPackage.SCHEMA__ENUM, SchemaPackage.Literals.SCHEMA__ENUM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMinimum() {
		return (Double)eDynamicGet(SchemaPackage.SCHEMA__MINIMUM, SchemaPackage.Literals.SCHEMA__MINIMUM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimum(Double newMinimum) {
		eDynamicSet(SchemaPackage.SCHEMA__MINIMUM, SchemaPackage.Literals.SCHEMA__MINIMUM, newMinimum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMaximum() {
		return (Double)eDynamicGet(SchemaPackage.SCHEMA__MAXIMUM, SchemaPackage.Literals.SCHEMA__MAXIMUM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximum(Double newMaximum) {
		eDynamicSet(SchemaPackage.SCHEMA__MAXIMUM, SchemaPackage.Literals.SCHEMA__MAXIMUM, newMaximum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getExclusiveMinimum() {
		return (Double)eDynamicGet(SchemaPackage.SCHEMA__EXCLUSIVE_MINIMUM, SchemaPackage.Literals.SCHEMA__EXCLUSIVE_MINIMUM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExclusiveMinimum(Double newExclusiveMinimum) {
		eDynamicSet(SchemaPackage.SCHEMA__EXCLUSIVE_MINIMUM, SchemaPackage.Literals.SCHEMA__EXCLUSIVE_MINIMUM, newExclusiveMinimum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getExclusiveMaximum() {
		return (Double)eDynamicGet(SchemaPackage.SCHEMA__EXCLUSIVE_MAXIMUM, SchemaPackage.Literals.SCHEMA__EXCLUSIVE_MAXIMUM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExclusiveMaximum(Double newExclusiveMaximum) {
		eDynamicSet(SchemaPackage.SCHEMA__EXCLUSIVE_MAXIMUM, SchemaPackage.Literals.SCHEMA__EXCLUSIVE_MAXIMUM, newExclusiveMaximum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMultipleOf() {
		return (Double)eDynamicGet(SchemaPackage.SCHEMA__MULTIPLE_OF, SchemaPackage.Literals.SCHEMA__MULTIPLE_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipleOf(Double newMultipleOf) {
		eDynamicSet(SchemaPackage.SCHEMA__MULTIPLE_OF, SchemaPackage.Literals.SCHEMA__MULTIPLE_OF, newMultipleOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinLength() {
		return (Integer)eDynamicGet(SchemaPackage.SCHEMA__MIN_LENGTH, SchemaPackage.Literals.SCHEMA__MIN_LENGTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinLength(Integer newMinLength) {
		eDynamicSet(SchemaPackage.SCHEMA__MIN_LENGTH, SchemaPackage.Literals.SCHEMA__MIN_LENGTH, newMinLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxLength() {
		return (Integer)eDynamicGet(SchemaPackage.SCHEMA__MAX_LENGTH, SchemaPackage.Literals.SCHEMA__MAX_LENGTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLength(Integer newMaxLength) {
		eDynamicSet(SchemaPackage.SCHEMA__MAX_LENGTH, SchemaPackage.Literals.SCHEMA__MAX_LENGTH, newMaxLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPattern() {
		return (String)eDynamicGet(SchemaPackage.SCHEMA__PATTERN, SchemaPackage.Literals.SCHEMA__PATTERN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(String newPattern) {
		eDynamicSet(SchemaPackage.SCHEMA__PATTERN, SchemaPackage.Literals.SCHEMA__PATTERN, newPattern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinItems() {
		return (Integer)eDynamicGet(SchemaPackage.SCHEMA__MIN_ITEMS, SchemaPackage.Literals.SCHEMA__MIN_ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinItems(Integer newMinItems) {
		eDynamicSet(SchemaPackage.SCHEMA__MIN_ITEMS, SchemaPackage.Literals.SCHEMA__MIN_ITEMS, newMinItems);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxItems() {
		return (Integer)eDynamicGet(SchemaPackage.SCHEMA__MAX_ITEMS, SchemaPackage.Literals.SCHEMA__MAX_ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxItems(Integer newMaxItems) {
		eDynamicSet(SchemaPackage.SCHEMA__MAX_ITEMS, SchemaPackage.Literals.SCHEMA__MAX_ITEMS, newMaxItems);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUniqueItems() {
		return (Boolean)eDynamicGet(SchemaPackage.SCHEMA__UNIQUE_ITEMS, SchemaPackage.Literals.SCHEMA__UNIQUE_ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniqueItems(Boolean newUniqueItems) {
		eDynamicSet(SchemaPackage.SCHEMA__UNIQUE_ITEMS, SchemaPackage.Literals.SCHEMA__UNIQUE_ITEMS, newUniqueItems);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinContains() {
		return (Integer)eDynamicGet(SchemaPackage.SCHEMA__MIN_CONTAINS, SchemaPackage.Literals.SCHEMA__MIN_CONTAINS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinContains(Integer newMinContains) {
		eDynamicSet(SchemaPackage.SCHEMA__MIN_CONTAINS, SchemaPackage.Literals.SCHEMA__MIN_CONTAINS, newMinContains);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxContains() {
		return (Integer)eDynamicGet(SchemaPackage.SCHEMA__MAX_CONTAINS, SchemaPackage.Literals.SCHEMA__MAX_CONTAINS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxContains(Integer newMaxContains) {
		eDynamicSet(SchemaPackage.SCHEMA__MAX_CONTAINS, SchemaPackage.Literals.SCHEMA__MAX_CONTAINS, newMaxContains);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getRequired() {
		return (EList<String>)eDynamicGet(SchemaPackage.SCHEMA__REQUIRED, SchemaPackage.Literals.SCHEMA__REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinProperties() {
		return (Integer)eDynamicGet(SchemaPackage.SCHEMA__MIN_PROPERTIES, SchemaPackage.Literals.SCHEMA__MIN_PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinProperties(Integer newMinProperties) {
		eDynamicSet(SchemaPackage.SCHEMA__MIN_PROPERTIES, SchemaPackage.Literals.SCHEMA__MIN_PROPERTIES, newMinProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxProperties() {
		return (Integer)eDynamicGet(SchemaPackage.SCHEMA__MAX_PROPERTIES, SchemaPackage.Literals.SCHEMA__MAX_PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxProperties(Integer newMaxProperties) {
		eDynamicSet(SchemaPackage.SCHEMA__MAX_PROPERTIES, SchemaPackage.Literals.SCHEMA__MAX_PROPERTIES, newMaxProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<StringListEntry> getDependentRequired() {
		return (EList<StringListEntry>)eDynamicGet(SchemaPackage.SCHEMA__DEPENDENT_REQUIRED, SchemaPackage.Literals.SCHEMA__DEPENDENT_REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Schema> getAllOf() {
		return (EList<Schema>)eDynamicGet(SchemaPackage.SCHEMA__ALL_OF, SchemaPackage.Literals.SCHEMA__ALL_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Schema> getAnyOf() {
		return (EList<Schema>)eDynamicGet(SchemaPackage.SCHEMA__ANY_OF, SchemaPackage.Literals.SCHEMA__ANY_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Schema> getOneOf() {
		return (EList<Schema>)eDynamicGet(SchemaPackage.SCHEMA__ONE_OF, SchemaPackage.Literals.SCHEMA__ONE_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getNot() {
		return (Schema)eDynamicGet(SchemaPackage.SCHEMA__NOT, SchemaPackage.Literals.SCHEMA__NOT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNot(Schema newNot, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newNot, SchemaPackage.SCHEMA__NOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNot(Schema newNot) {
		eDynamicSet(SchemaPackage.SCHEMA__NOT, SchemaPackage.Literals.SCHEMA__NOT, newNot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getIf() {
		return (Schema)eDynamicGet(SchemaPackage.SCHEMA__IF, SchemaPackage.Literals.SCHEMA__IF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf(Schema newIf, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newIf, SchemaPackage.SCHEMA__IF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIf(Schema newIf) {
		eDynamicSet(SchemaPackage.SCHEMA__IF, SchemaPackage.Literals.SCHEMA__IF, newIf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getThen() {
		return (Schema)eDynamicGet(SchemaPackage.SCHEMA__THEN, SchemaPackage.Literals.SCHEMA__THEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThen(Schema newThen, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newThen, SchemaPackage.SCHEMA__THEN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThen(Schema newThen) {
		eDynamicSet(SchemaPackage.SCHEMA__THEN, SchemaPackage.Literals.SCHEMA__THEN, newThen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getElse() {
		return (Schema)eDynamicGet(SchemaPackage.SCHEMA__ELSE, SchemaPackage.Literals.SCHEMA__ELSE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(Schema newElse, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newElse, SchemaPackage.SCHEMA__ELSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElse(Schema newElse) {
		eDynamicSet(SchemaPackage.SCHEMA__ELSE, SchemaPackage.Literals.SCHEMA__ELSE, newElse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SchemaEntry> getProperties() {
		return (EList<SchemaEntry>)eDynamicGet(SchemaPackage.SCHEMA__PROPERTIES, SchemaPackage.Literals.SCHEMA__PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SchemaEntry> getPatternProperties() {
		return (EList<SchemaEntry>)eDynamicGet(SchemaPackage.SCHEMA__PATTERN_PROPERTIES, SchemaPackage.Literals.SCHEMA__PATTERN_PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getAdditionalProperties() {
		return (Schema)eDynamicGet(SchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES, SchemaPackage.Literals.SCHEMA__ADDITIONAL_PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalProperties(Schema newAdditionalProperties, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAdditionalProperties, SchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalProperties(Schema newAdditionalProperties) {
		eDynamicSet(SchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES, SchemaPackage.Literals.SCHEMA__ADDITIONAL_PROPERTIES, newAdditionalProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAdditionalPropertiesBoolean() {
		return (Boolean)eDynamicGet(SchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN, SchemaPackage.Literals.SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalPropertiesBoolean(Boolean newAdditionalPropertiesBoolean) {
		eDynamicSet(SchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN, SchemaPackage.Literals.SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN, newAdditionalPropertiesBoolean);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getUnevaluatedProperties() {
		return (Schema)eDynamicGet(SchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES, SchemaPackage.Literals.SCHEMA__UNEVALUATED_PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnevaluatedProperties(Schema newUnevaluatedProperties, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newUnevaluatedProperties, SchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnevaluatedProperties(Schema newUnevaluatedProperties) {
		eDynamicSet(SchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES, SchemaPackage.Literals.SCHEMA__UNEVALUATED_PROPERTIES, newUnevaluatedProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUnevaluatedPropertiesBoolean() {
		return (Boolean)eDynamicGet(SchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN, SchemaPackage.Literals.SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnevaluatedPropertiesBoolean(Boolean newUnevaluatedPropertiesBoolean) {
		eDynamicSet(SchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN, SchemaPackage.Literals.SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN, newUnevaluatedPropertiesBoolean);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SchemaEntry> getDependentSchemas() {
		return (EList<SchemaEntry>)eDynamicGet(SchemaPackage.SCHEMA__DEPENDENT_SCHEMAS, SchemaPackage.Literals.SCHEMA__DEPENDENT_SCHEMAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getItems() {
		return (Schema)eDynamicGet(SchemaPackage.SCHEMA__ITEMS, SchemaPackage.Literals.SCHEMA__ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems(Schema newItems, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newItems, SchemaPackage.SCHEMA__ITEMS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItems(Schema newItems) {
		eDynamicSet(SchemaPackage.SCHEMA__ITEMS, SchemaPackage.Literals.SCHEMA__ITEMS, newItems);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getItemsBoolean() {
		return (Boolean)eDynamicGet(SchemaPackage.SCHEMA__ITEMS_BOOLEAN, SchemaPackage.Literals.SCHEMA__ITEMS_BOOLEAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemsBoolean(Boolean newItemsBoolean) {
		eDynamicSet(SchemaPackage.SCHEMA__ITEMS_BOOLEAN, SchemaPackage.Literals.SCHEMA__ITEMS_BOOLEAN, newItemsBoolean);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Schema> getPrefixItems() {
		return (EList<Schema>)eDynamicGet(SchemaPackage.SCHEMA__PREFIX_ITEMS, SchemaPackage.Literals.SCHEMA__PREFIX_ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getContains() {
		return (Schema)eDynamicGet(SchemaPackage.SCHEMA__CONTAINS, SchemaPackage.Literals.SCHEMA__CONTAINS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContains(Schema newContains, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newContains, SchemaPackage.SCHEMA__CONTAINS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContains(Schema newContains) {
		eDynamicSet(SchemaPackage.SCHEMA__CONTAINS, SchemaPackage.Literals.SCHEMA__CONTAINS, newContains);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getUnevaluatedItems() {
		return (Schema)eDynamicGet(SchemaPackage.SCHEMA__UNEVALUATED_ITEMS, SchemaPackage.Literals.SCHEMA__UNEVALUATED_ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnevaluatedItems(Schema newUnevaluatedItems, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newUnevaluatedItems, SchemaPackage.SCHEMA__UNEVALUATED_ITEMS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnevaluatedItems(Schema newUnevaluatedItems) {
		eDynamicSet(SchemaPackage.SCHEMA__UNEVALUATED_ITEMS, SchemaPackage.Literals.SCHEMA__UNEVALUATED_ITEMS, newUnevaluatedItems);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(SchemaPackage.SCHEMA__TITLE, SchemaPackage.Literals.SCHEMA__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(SchemaPackage.SCHEMA__TITLE, SchemaPackage.Literals.SCHEMA__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(SchemaPackage.SCHEMA__DESCRIPTION, SchemaPackage.Literals.SCHEMA__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(SchemaPackage.SCHEMA__DESCRIPTION, SchemaPackage.Literals.SCHEMA__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefault() {
		return (String)eDynamicGet(SchemaPackage.SCHEMA__DEFAULT, SchemaPackage.Literals.SCHEMA__DEFAULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault(String newDefault) {
		eDynamicSet(SchemaPackage.SCHEMA__DEFAULT, SchemaPackage.Literals.SCHEMA__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeprecated() {
		return (Boolean)eDynamicGet(SchemaPackage.SCHEMA__DEPRECATED, SchemaPackage.Literals.SCHEMA__DEPRECATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeprecated(Boolean newDeprecated) {
		eDynamicSet(SchemaPackage.SCHEMA__DEPRECATED, SchemaPackage.Literals.SCHEMA__DEPRECATED, newDeprecated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getReadOnly() {
		return (Boolean)eDynamicGet(SchemaPackage.SCHEMA__READ_ONLY, SchemaPackage.Literals.SCHEMA__READ_ONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOnly(Boolean newReadOnly) {
		eDynamicSet(SchemaPackage.SCHEMA__READ_ONLY, SchemaPackage.Literals.SCHEMA__READ_ONLY, newReadOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getWriteOnly() {
		return (Boolean)eDynamicGet(SchemaPackage.SCHEMA__WRITE_ONLY, SchemaPackage.Literals.SCHEMA__WRITE_ONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteOnly(Boolean newWriteOnly) {
		eDynamicSet(SchemaPackage.SCHEMA__WRITE_ONLY, SchemaPackage.Literals.SCHEMA__WRITE_ONLY, newWriteOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getExamples() {
		return (EList<String>)eDynamicGet(SchemaPackage.SCHEMA__EXAMPLES, SchemaPackage.Literals.SCHEMA__EXAMPLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return (String)eDynamicGet(SchemaPackage.SCHEMA__FORMAT, SchemaPackage.Literals.SCHEMA__FORMAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(String newFormat) {
		eDynamicSet(SchemaPackage.SCHEMA__FORMAT, SchemaPackage.Literals.SCHEMA__FORMAT, newFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentEncoding() {
		return (String)eDynamicGet(SchemaPackage.SCHEMA__CONTENT_ENCODING, SchemaPackage.Literals.SCHEMA__CONTENT_ENCODING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentEncoding(String newContentEncoding) {
		eDynamicSet(SchemaPackage.SCHEMA__CONTENT_ENCODING, SchemaPackage.Literals.SCHEMA__CONTENT_ENCODING, newContentEncoding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentMediaType() {
		return (String)eDynamicGet(SchemaPackage.SCHEMA__CONTENT_MEDIA_TYPE, SchemaPackage.Literals.SCHEMA__CONTENT_MEDIA_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentMediaType(String newContentMediaType) {
		eDynamicSet(SchemaPackage.SCHEMA__CONTENT_MEDIA_TYPE, SchemaPackage.Literals.SCHEMA__CONTENT_MEDIA_TYPE, newContentMediaType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getContentSchema() {
		return (Schema)eDynamicGet(SchemaPackage.SCHEMA__CONTENT_SCHEMA, SchemaPackage.Literals.SCHEMA__CONTENT_SCHEMA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentSchema(Schema newContentSchema, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newContentSchema, SchemaPackage.SCHEMA__CONTENT_SCHEMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentSchema(Schema newContentSchema) {
		eDynamicSet(SchemaPackage.SCHEMA__CONTENT_SCHEMA, SchemaPackage.Literals.SCHEMA__CONTENT_SCHEMA, newContentSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.SCHEMA__DEFS:
				return ((InternalEList<?>)getDefs()).basicRemove(otherEnd, msgs);
			case SchemaPackage.SCHEMA__DEPENDENT_REQUIRED:
				return ((InternalEList<?>)getDependentRequired()).basicRemove(otherEnd, msgs);
			case SchemaPackage.SCHEMA__ALL_OF:
				return ((InternalEList<?>)getAllOf()).basicRemove(otherEnd, msgs);
			case SchemaPackage.SCHEMA__ANY_OF:
				return ((InternalEList<?>)getAnyOf()).basicRemove(otherEnd, msgs);
			case SchemaPackage.SCHEMA__ONE_OF:
				return ((InternalEList<?>)getOneOf()).basicRemove(otherEnd, msgs);
			case SchemaPackage.SCHEMA__NOT:
				return basicSetNot(null, msgs);
			case SchemaPackage.SCHEMA__IF:
				return basicSetIf(null, msgs);
			case SchemaPackage.SCHEMA__THEN:
				return basicSetThen(null, msgs);
			case SchemaPackage.SCHEMA__ELSE:
				return basicSetElse(null, msgs);
			case SchemaPackage.SCHEMA__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case SchemaPackage.SCHEMA__PATTERN_PROPERTIES:
				return ((InternalEList<?>)getPatternProperties()).basicRemove(otherEnd, msgs);
			case SchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES:
				return basicSetAdditionalProperties(null, msgs);
			case SchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES:
				return basicSetUnevaluatedProperties(null, msgs);
			case SchemaPackage.SCHEMA__DEPENDENT_SCHEMAS:
				return ((InternalEList<?>)getDependentSchemas()).basicRemove(otherEnd, msgs);
			case SchemaPackage.SCHEMA__ITEMS:
				return basicSetItems(null, msgs);
			case SchemaPackage.SCHEMA__PREFIX_ITEMS:
				return ((InternalEList<?>)getPrefixItems()).basicRemove(otherEnd, msgs);
			case SchemaPackage.SCHEMA__CONTAINS:
				return basicSetContains(null, msgs);
			case SchemaPackage.SCHEMA__UNEVALUATED_ITEMS:
				return basicSetUnevaluatedItems(null, msgs);
			case SchemaPackage.SCHEMA__CONTENT_SCHEMA:
				return basicSetContentSchema(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.SCHEMA__SCHEMA_VERSION:
				return getSchemaVersion();
			case SchemaPackage.SCHEMA__ID:
				return getId();
			case SchemaPackage.SCHEMA__ANCHOR:
				return getAnchor();
			case SchemaPackage.SCHEMA__DYNAMIC_ANCHOR:
				return getDynamicAnchor();
			case SchemaPackage.SCHEMA__REF:
				return getRef();
			case SchemaPackage.SCHEMA__DYNAMIC_REF:
				return getDynamicRef();
			case SchemaPackage.SCHEMA__COMMENT:
				return getComment();
			case SchemaPackage.SCHEMA__DEFS:
				return getDefs();
			case SchemaPackage.SCHEMA__BOOLEAN_VALUE:
				return getBooleanValue();
			case SchemaPackage.SCHEMA__TYPES:
				return getTypes();
			case SchemaPackage.SCHEMA__CONST:
				return getConst();
			case SchemaPackage.SCHEMA__ENUM:
				return getEnum();
			case SchemaPackage.SCHEMA__MINIMUM:
				return getMinimum();
			case SchemaPackage.SCHEMA__MAXIMUM:
				return getMaximum();
			case SchemaPackage.SCHEMA__EXCLUSIVE_MINIMUM:
				return getExclusiveMinimum();
			case SchemaPackage.SCHEMA__EXCLUSIVE_MAXIMUM:
				return getExclusiveMaximum();
			case SchemaPackage.SCHEMA__MULTIPLE_OF:
				return getMultipleOf();
			case SchemaPackage.SCHEMA__MIN_LENGTH:
				return getMinLength();
			case SchemaPackage.SCHEMA__MAX_LENGTH:
				return getMaxLength();
			case SchemaPackage.SCHEMA__PATTERN:
				return getPattern();
			case SchemaPackage.SCHEMA__MIN_ITEMS:
				return getMinItems();
			case SchemaPackage.SCHEMA__MAX_ITEMS:
				return getMaxItems();
			case SchemaPackage.SCHEMA__UNIQUE_ITEMS:
				return getUniqueItems();
			case SchemaPackage.SCHEMA__MIN_CONTAINS:
				return getMinContains();
			case SchemaPackage.SCHEMA__MAX_CONTAINS:
				return getMaxContains();
			case SchemaPackage.SCHEMA__REQUIRED:
				return getRequired();
			case SchemaPackage.SCHEMA__MIN_PROPERTIES:
				return getMinProperties();
			case SchemaPackage.SCHEMA__MAX_PROPERTIES:
				return getMaxProperties();
			case SchemaPackage.SCHEMA__DEPENDENT_REQUIRED:
				return getDependentRequired();
			case SchemaPackage.SCHEMA__ALL_OF:
				return getAllOf();
			case SchemaPackage.SCHEMA__ANY_OF:
				return getAnyOf();
			case SchemaPackage.SCHEMA__ONE_OF:
				return getOneOf();
			case SchemaPackage.SCHEMA__NOT:
				return getNot();
			case SchemaPackage.SCHEMA__IF:
				return getIf();
			case SchemaPackage.SCHEMA__THEN:
				return getThen();
			case SchemaPackage.SCHEMA__ELSE:
				return getElse();
			case SchemaPackage.SCHEMA__PROPERTIES:
				return getProperties();
			case SchemaPackage.SCHEMA__PATTERN_PROPERTIES:
				return getPatternProperties();
			case SchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES:
				return getAdditionalProperties();
			case SchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN:
				return getAdditionalPropertiesBoolean();
			case SchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES:
				return getUnevaluatedProperties();
			case SchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN:
				return getUnevaluatedPropertiesBoolean();
			case SchemaPackage.SCHEMA__DEPENDENT_SCHEMAS:
				return getDependentSchemas();
			case SchemaPackage.SCHEMA__ITEMS:
				return getItems();
			case SchemaPackage.SCHEMA__ITEMS_BOOLEAN:
				return getItemsBoolean();
			case SchemaPackage.SCHEMA__PREFIX_ITEMS:
				return getPrefixItems();
			case SchemaPackage.SCHEMA__CONTAINS:
				return getContains();
			case SchemaPackage.SCHEMA__UNEVALUATED_ITEMS:
				return getUnevaluatedItems();
			case SchemaPackage.SCHEMA__TITLE:
				return getTitle();
			case SchemaPackage.SCHEMA__DESCRIPTION:
				return getDescription();
			case SchemaPackage.SCHEMA__DEFAULT:
				return getDefault();
			case SchemaPackage.SCHEMA__DEPRECATED:
				return getDeprecated();
			case SchemaPackage.SCHEMA__READ_ONLY:
				return getReadOnly();
			case SchemaPackage.SCHEMA__WRITE_ONLY:
				return getWriteOnly();
			case SchemaPackage.SCHEMA__EXAMPLES:
				return getExamples();
			case SchemaPackage.SCHEMA__FORMAT:
				return getFormat();
			case SchemaPackage.SCHEMA__CONTENT_ENCODING:
				return getContentEncoding();
			case SchemaPackage.SCHEMA__CONTENT_MEDIA_TYPE:
				return getContentMediaType();
			case SchemaPackage.SCHEMA__CONTENT_SCHEMA:
				return getContentSchema();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.SCHEMA__SCHEMA_VERSION:
				setSchemaVersion((String)newValue);
				return;
			case SchemaPackage.SCHEMA__ID:
				setId((String)newValue);
				return;
			case SchemaPackage.SCHEMA__ANCHOR:
				setAnchor((String)newValue);
				return;
			case SchemaPackage.SCHEMA__DYNAMIC_ANCHOR:
				setDynamicAnchor((String)newValue);
				return;
			case SchemaPackage.SCHEMA__REF:
				setRef((String)newValue);
				return;
			case SchemaPackage.SCHEMA__DYNAMIC_REF:
				setDynamicRef((String)newValue);
				return;
			case SchemaPackage.SCHEMA__COMMENT:
				setComment((String)newValue);
				return;
			case SchemaPackage.SCHEMA__DEFS:
				getDefs().clear();
				getDefs().addAll((Collection<? extends SchemaEntry>)newValue);
				return;
			case SchemaPackage.SCHEMA__BOOLEAN_VALUE:
				setBooleanValue((Boolean)newValue);
				return;
			case SchemaPackage.SCHEMA__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case SchemaPackage.SCHEMA__CONST:
				setConst((String)newValue);
				return;
			case SchemaPackage.SCHEMA__ENUM:
				getEnum().clear();
				getEnum().addAll((Collection<? extends String>)newValue);
				return;
			case SchemaPackage.SCHEMA__MINIMUM:
				setMinimum((Double)newValue);
				return;
			case SchemaPackage.SCHEMA__MAXIMUM:
				setMaximum((Double)newValue);
				return;
			case SchemaPackage.SCHEMA__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum((Double)newValue);
				return;
			case SchemaPackage.SCHEMA__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum((Double)newValue);
				return;
			case SchemaPackage.SCHEMA__MULTIPLE_OF:
				setMultipleOf((Double)newValue);
				return;
			case SchemaPackage.SCHEMA__MIN_LENGTH:
				setMinLength((Integer)newValue);
				return;
			case SchemaPackage.SCHEMA__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case SchemaPackage.SCHEMA__PATTERN:
				setPattern((String)newValue);
				return;
			case SchemaPackage.SCHEMA__MIN_ITEMS:
				setMinItems((Integer)newValue);
				return;
			case SchemaPackage.SCHEMA__MAX_ITEMS:
				setMaxItems((Integer)newValue);
				return;
			case SchemaPackage.SCHEMA__UNIQUE_ITEMS:
				setUniqueItems((Boolean)newValue);
				return;
			case SchemaPackage.SCHEMA__MIN_CONTAINS:
				setMinContains((Integer)newValue);
				return;
			case SchemaPackage.SCHEMA__MAX_CONTAINS:
				setMaxContains((Integer)newValue);
				return;
			case SchemaPackage.SCHEMA__REQUIRED:
				getRequired().clear();
				getRequired().addAll((Collection<? extends String>)newValue);
				return;
			case SchemaPackage.SCHEMA__MIN_PROPERTIES:
				setMinProperties((Integer)newValue);
				return;
			case SchemaPackage.SCHEMA__MAX_PROPERTIES:
				setMaxProperties((Integer)newValue);
				return;
			case SchemaPackage.SCHEMA__DEPENDENT_REQUIRED:
				getDependentRequired().clear();
				getDependentRequired().addAll((Collection<? extends StringListEntry>)newValue);
				return;
			case SchemaPackage.SCHEMA__ALL_OF:
				getAllOf().clear();
				getAllOf().addAll((Collection<? extends Schema>)newValue);
				return;
			case SchemaPackage.SCHEMA__ANY_OF:
				getAnyOf().clear();
				getAnyOf().addAll((Collection<? extends Schema>)newValue);
				return;
			case SchemaPackage.SCHEMA__ONE_OF:
				getOneOf().clear();
				getOneOf().addAll((Collection<? extends Schema>)newValue);
				return;
			case SchemaPackage.SCHEMA__NOT:
				setNot((Schema)newValue);
				return;
			case SchemaPackage.SCHEMA__IF:
				setIf((Schema)newValue);
				return;
			case SchemaPackage.SCHEMA__THEN:
				setThen((Schema)newValue);
				return;
			case SchemaPackage.SCHEMA__ELSE:
				setElse((Schema)newValue);
				return;
			case SchemaPackage.SCHEMA__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends SchemaEntry>)newValue);
				return;
			case SchemaPackage.SCHEMA__PATTERN_PROPERTIES:
				getPatternProperties().clear();
				getPatternProperties().addAll((Collection<? extends SchemaEntry>)newValue);
				return;
			case SchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES:
				setAdditionalProperties((Schema)newValue);
				return;
			case SchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN:
				setAdditionalPropertiesBoolean((Boolean)newValue);
				return;
			case SchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES:
				setUnevaluatedProperties((Schema)newValue);
				return;
			case SchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN:
				setUnevaluatedPropertiesBoolean((Boolean)newValue);
				return;
			case SchemaPackage.SCHEMA__DEPENDENT_SCHEMAS:
				getDependentSchemas().clear();
				getDependentSchemas().addAll((Collection<? extends SchemaEntry>)newValue);
				return;
			case SchemaPackage.SCHEMA__ITEMS:
				setItems((Schema)newValue);
				return;
			case SchemaPackage.SCHEMA__ITEMS_BOOLEAN:
				setItemsBoolean((Boolean)newValue);
				return;
			case SchemaPackage.SCHEMA__PREFIX_ITEMS:
				getPrefixItems().clear();
				getPrefixItems().addAll((Collection<? extends Schema>)newValue);
				return;
			case SchemaPackage.SCHEMA__CONTAINS:
				setContains((Schema)newValue);
				return;
			case SchemaPackage.SCHEMA__UNEVALUATED_ITEMS:
				setUnevaluatedItems((Schema)newValue);
				return;
			case SchemaPackage.SCHEMA__TITLE:
				setTitle((String)newValue);
				return;
			case SchemaPackage.SCHEMA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SchemaPackage.SCHEMA__DEFAULT:
				setDefault((String)newValue);
				return;
			case SchemaPackage.SCHEMA__DEPRECATED:
				setDeprecated((Boolean)newValue);
				return;
			case SchemaPackage.SCHEMA__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case SchemaPackage.SCHEMA__WRITE_ONLY:
				setWriteOnly((Boolean)newValue);
				return;
			case SchemaPackage.SCHEMA__EXAMPLES:
				getExamples().clear();
				getExamples().addAll((Collection<? extends String>)newValue);
				return;
			case SchemaPackage.SCHEMA__FORMAT:
				setFormat((String)newValue);
				return;
			case SchemaPackage.SCHEMA__CONTENT_ENCODING:
				setContentEncoding((String)newValue);
				return;
			case SchemaPackage.SCHEMA__CONTENT_MEDIA_TYPE:
				setContentMediaType((String)newValue);
				return;
			case SchemaPackage.SCHEMA__CONTENT_SCHEMA:
				setContentSchema((Schema)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchemaPackage.SCHEMA__SCHEMA_VERSION:
				setSchemaVersion(SCHEMA_VERSION_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__ID:
				setId(ID_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__ANCHOR:
				setAnchor(ANCHOR_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__DYNAMIC_ANCHOR:
				setDynamicAnchor(DYNAMIC_ANCHOR_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__REF:
				setRef(REF_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__DYNAMIC_REF:
				setDynamicRef(DYNAMIC_REF_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__DEFS:
				getDefs().clear();
				return;
			case SchemaPackage.SCHEMA__BOOLEAN_VALUE:
				setBooleanValue(BOOLEAN_VALUE_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__TYPES:
				getTypes().clear();
				return;
			case SchemaPackage.SCHEMA__CONST:
				setConst(CONST_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__ENUM:
				getEnum().clear();
				return;
			case SchemaPackage.SCHEMA__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum(EXCLUSIVE_MINIMUM_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum(EXCLUSIVE_MAXIMUM_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__MULTIPLE_OF:
				setMultipleOf(MULTIPLE_OF_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__MIN_ITEMS:
				setMinItems(MIN_ITEMS_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__MAX_ITEMS:
				setMaxItems(MAX_ITEMS_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__UNIQUE_ITEMS:
				setUniqueItems(UNIQUE_ITEMS_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__MIN_CONTAINS:
				setMinContains(MIN_CONTAINS_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__MAX_CONTAINS:
				setMaxContains(MAX_CONTAINS_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__REQUIRED:
				getRequired().clear();
				return;
			case SchemaPackage.SCHEMA__MIN_PROPERTIES:
				setMinProperties(MIN_PROPERTIES_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__MAX_PROPERTIES:
				setMaxProperties(MAX_PROPERTIES_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__DEPENDENT_REQUIRED:
				getDependentRequired().clear();
				return;
			case SchemaPackage.SCHEMA__ALL_OF:
				getAllOf().clear();
				return;
			case SchemaPackage.SCHEMA__ANY_OF:
				getAnyOf().clear();
				return;
			case SchemaPackage.SCHEMA__ONE_OF:
				getOneOf().clear();
				return;
			case SchemaPackage.SCHEMA__NOT:
				setNot((Schema)null);
				return;
			case SchemaPackage.SCHEMA__IF:
				setIf((Schema)null);
				return;
			case SchemaPackage.SCHEMA__THEN:
				setThen((Schema)null);
				return;
			case SchemaPackage.SCHEMA__ELSE:
				setElse((Schema)null);
				return;
			case SchemaPackage.SCHEMA__PROPERTIES:
				getProperties().clear();
				return;
			case SchemaPackage.SCHEMA__PATTERN_PROPERTIES:
				getPatternProperties().clear();
				return;
			case SchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES:
				setAdditionalProperties((Schema)null);
				return;
			case SchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN:
				setAdditionalPropertiesBoolean(ADDITIONAL_PROPERTIES_BOOLEAN_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES:
				setUnevaluatedProperties((Schema)null);
				return;
			case SchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN:
				setUnevaluatedPropertiesBoolean(UNEVALUATED_PROPERTIES_BOOLEAN_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__DEPENDENT_SCHEMAS:
				getDependentSchemas().clear();
				return;
			case SchemaPackage.SCHEMA__ITEMS:
				setItems((Schema)null);
				return;
			case SchemaPackage.SCHEMA__ITEMS_BOOLEAN:
				setItemsBoolean(ITEMS_BOOLEAN_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__PREFIX_ITEMS:
				getPrefixItems().clear();
				return;
			case SchemaPackage.SCHEMA__CONTAINS:
				setContains((Schema)null);
				return;
			case SchemaPackage.SCHEMA__UNEVALUATED_ITEMS:
				setUnevaluatedItems((Schema)null);
				return;
			case SchemaPackage.SCHEMA__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__DEPRECATED:
				setDeprecated(DEPRECATED_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__WRITE_ONLY:
				setWriteOnly(WRITE_ONLY_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__EXAMPLES:
				getExamples().clear();
				return;
			case SchemaPackage.SCHEMA__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__CONTENT_ENCODING:
				setContentEncoding(CONTENT_ENCODING_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__CONTENT_MEDIA_TYPE:
				setContentMediaType(CONTENT_MEDIA_TYPE_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA__CONTENT_SCHEMA:
				setContentSchema((Schema)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchemaPackage.SCHEMA__SCHEMA_VERSION:
				return SCHEMA_VERSION_EDEFAULT == null ? getSchemaVersion() != null : !SCHEMA_VERSION_EDEFAULT.equals(getSchemaVersion());
			case SchemaPackage.SCHEMA__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case SchemaPackage.SCHEMA__ANCHOR:
				return ANCHOR_EDEFAULT == null ? getAnchor() != null : !ANCHOR_EDEFAULT.equals(getAnchor());
			case SchemaPackage.SCHEMA__DYNAMIC_ANCHOR:
				return DYNAMIC_ANCHOR_EDEFAULT == null ? getDynamicAnchor() != null : !DYNAMIC_ANCHOR_EDEFAULT.equals(getDynamicAnchor());
			case SchemaPackage.SCHEMA__REF:
				return REF_EDEFAULT == null ? getRef() != null : !REF_EDEFAULT.equals(getRef());
			case SchemaPackage.SCHEMA__DYNAMIC_REF:
				return DYNAMIC_REF_EDEFAULT == null ? getDynamicRef() != null : !DYNAMIC_REF_EDEFAULT.equals(getDynamicRef());
			case SchemaPackage.SCHEMA__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case SchemaPackage.SCHEMA__DEFS:
				return !getDefs().isEmpty();
			case SchemaPackage.SCHEMA__BOOLEAN_VALUE:
				return BOOLEAN_VALUE_EDEFAULT == null ? getBooleanValue() != null : !BOOLEAN_VALUE_EDEFAULT.equals(getBooleanValue());
			case SchemaPackage.SCHEMA__TYPES:
				return !getTypes().isEmpty();
			case SchemaPackage.SCHEMA__CONST:
				return CONST_EDEFAULT == null ? getConst() != null : !CONST_EDEFAULT.equals(getConst());
			case SchemaPackage.SCHEMA__ENUM:
				return !getEnum().isEmpty();
			case SchemaPackage.SCHEMA__MINIMUM:
				return MINIMUM_EDEFAULT == null ? getMinimum() != null : !MINIMUM_EDEFAULT.equals(getMinimum());
			case SchemaPackage.SCHEMA__MAXIMUM:
				return MAXIMUM_EDEFAULT == null ? getMaximum() != null : !MAXIMUM_EDEFAULT.equals(getMaximum());
			case SchemaPackage.SCHEMA__EXCLUSIVE_MINIMUM:
				return EXCLUSIVE_MINIMUM_EDEFAULT == null ? getExclusiveMinimum() != null : !EXCLUSIVE_MINIMUM_EDEFAULT.equals(getExclusiveMinimum());
			case SchemaPackage.SCHEMA__EXCLUSIVE_MAXIMUM:
				return EXCLUSIVE_MAXIMUM_EDEFAULT == null ? getExclusiveMaximum() != null : !EXCLUSIVE_MAXIMUM_EDEFAULT.equals(getExclusiveMaximum());
			case SchemaPackage.SCHEMA__MULTIPLE_OF:
				return MULTIPLE_OF_EDEFAULT == null ? getMultipleOf() != null : !MULTIPLE_OF_EDEFAULT.equals(getMultipleOf());
			case SchemaPackage.SCHEMA__MIN_LENGTH:
				return MIN_LENGTH_EDEFAULT == null ? getMinLength() != null : !MIN_LENGTH_EDEFAULT.equals(getMinLength());
			case SchemaPackage.SCHEMA__MAX_LENGTH:
				return MAX_LENGTH_EDEFAULT == null ? getMaxLength() != null : !MAX_LENGTH_EDEFAULT.equals(getMaxLength());
			case SchemaPackage.SCHEMA__PATTERN:
				return PATTERN_EDEFAULT == null ? getPattern() != null : !PATTERN_EDEFAULT.equals(getPattern());
			case SchemaPackage.SCHEMA__MIN_ITEMS:
				return MIN_ITEMS_EDEFAULT == null ? getMinItems() != null : !MIN_ITEMS_EDEFAULT.equals(getMinItems());
			case SchemaPackage.SCHEMA__MAX_ITEMS:
				return MAX_ITEMS_EDEFAULT == null ? getMaxItems() != null : !MAX_ITEMS_EDEFAULT.equals(getMaxItems());
			case SchemaPackage.SCHEMA__UNIQUE_ITEMS:
				return UNIQUE_ITEMS_EDEFAULT == null ? getUniqueItems() != null : !UNIQUE_ITEMS_EDEFAULT.equals(getUniqueItems());
			case SchemaPackage.SCHEMA__MIN_CONTAINS:
				return MIN_CONTAINS_EDEFAULT == null ? getMinContains() != null : !MIN_CONTAINS_EDEFAULT.equals(getMinContains());
			case SchemaPackage.SCHEMA__MAX_CONTAINS:
				return MAX_CONTAINS_EDEFAULT == null ? getMaxContains() != null : !MAX_CONTAINS_EDEFAULT.equals(getMaxContains());
			case SchemaPackage.SCHEMA__REQUIRED:
				return !getRequired().isEmpty();
			case SchemaPackage.SCHEMA__MIN_PROPERTIES:
				return MIN_PROPERTIES_EDEFAULT == null ? getMinProperties() != null : !MIN_PROPERTIES_EDEFAULT.equals(getMinProperties());
			case SchemaPackage.SCHEMA__MAX_PROPERTIES:
				return MAX_PROPERTIES_EDEFAULT == null ? getMaxProperties() != null : !MAX_PROPERTIES_EDEFAULT.equals(getMaxProperties());
			case SchemaPackage.SCHEMA__DEPENDENT_REQUIRED:
				return !getDependentRequired().isEmpty();
			case SchemaPackage.SCHEMA__ALL_OF:
				return !getAllOf().isEmpty();
			case SchemaPackage.SCHEMA__ANY_OF:
				return !getAnyOf().isEmpty();
			case SchemaPackage.SCHEMA__ONE_OF:
				return !getOneOf().isEmpty();
			case SchemaPackage.SCHEMA__NOT:
				return getNot() != null;
			case SchemaPackage.SCHEMA__IF:
				return getIf() != null;
			case SchemaPackage.SCHEMA__THEN:
				return getThen() != null;
			case SchemaPackage.SCHEMA__ELSE:
				return getElse() != null;
			case SchemaPackage.SCHEMA__PROPERTIES:
				return !getProperties().isEmpty();
			case SchemaPackage.SCHEMA__PATTERN_PROPERTIES:
				return !getPatternProperties().isEmpty();
			case SchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES:
				return getAdditionalProperties() != null;
			case SchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN:
				return ADDITIONAL_PROPERTIES_BOOLEAN_EDEFAULT == null ? getAdditionalPropertiesBoolean() != null : !ADDITIONAL_PROPERTIES_BOOLEAN_EDEFAULT.equals(getAdditionalPropertiesBoolean());
			case SchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES:
				return getUnevaluatedProperties() != null;
			case SchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN:
				return UNEVALUATED_PROPERTIES_BOOLEAN_EDEFAULT == null ? getUnevaluatedPropertiesBoolean() != null : !UNEVALUATED_PROPERTIES_BOOLEAN_EDEFAULT.equals(getUnevaluatedPropertiesBoolean());
			case SchemaPackage.SCHEMA__DEPENDENT_SCHEMAS:
				return !getDependentSchemas().isEmpty();
			case SchemaPackage.SCHEMA__ITEMS:
				return getItems() != null;
			case SchemaPackage.SCHEMA__ITEMS_BOOLEAN:
				return ITEMS_BOOLEAN_EDEFAULT == null ? getItemsBoolean() != null : !ITEMS_BOOLEAN_EDEFAULT.equals(getItemsBoolean());
			case SchemaPackage.SCHEMA__PREFIX_ITEMS:
				return !getPrefixItems().isEmpty();
			case SchemaPackage.SCHEMA__CONTAINS:
				return getContains() != null;
			case SchemaPackage.SCHEMA__UNEVALUATED_ITEMS:
				return getUnevaluatedItems() != null;
			case SchemaPackage.SCHEMA__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case SchemaPackage.SCHEMA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case SchemaPackage.SCHEMA__DEFAULT:
				return DEFAULT_EDEFAULT == null ? getDefault() != null : !DEFAULT_EDEFAULT.equals(getDefault());
			case SchemaPackage.SCHEMA__DEPRECATED:
				return DEPRECATED_EDEFAULT == null ? getDeprecated() != null : !DEPRECATED_EDEFAULT.equals(getDeprecated());
			case SchemaPackage.SCHEMA__READ_ONLY:
				return READ_ONLY_EDEFAULT == null ? getReadOnly() != null : !READ_ONLY_EDEFAULT.equals(getReadOnly());
			case SchemaPackage.SCHEMA__WRITE_ONLY:
				return WRITE_ONLY_EDEFAULT == null ? getWriteOnly() != null : !WRITE_ONLY_EDEFAULT.equals(getWriteOnly());
			case SchemaPackage.SCHEMA__EXAMPLES:
				return !getExamples().isEmpty();
			case SchemaPackage.SCHEMA__FORMAT:
				return FORMAT_EDEFAULT == null ? getFormat() != null : !FORMAT_EDEFAULT.equals(getFormat());
			case SchemaPackage.SCHEMA__CONTENT_ENCODING:
				return CONTENT_ENCODING_EDEFAULT == null ? getContentEncoding() != null : !CONTENT_ENCODING_EDEFAULT.equals(getContentEncoding());
			case SchemaPackage.SCHEMA__CONTENT_MEDIA_TYPE:
				return CONTENT_MEDIA_TYPE_EDEFAULT == null ? getContentMediaType() != null : !CONTENT_MEDIA_TYPE_EDEFAULT.equals(getContentMediaType());
			case SchemaPackage.SCHEMA__CONTENT_SCHEMA:
				return getContentSchema() != null;
		}
		return super.eIsSet(featureID);
	}

} //SchemaImpl
