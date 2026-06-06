/**
 */
package org.nasdanika.models.json.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a JSON Schema 2020-12 schema object. All features are optional.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getDynamicAnchor <em>Dynamic Anchor</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getRef <em>Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getDynamicRef <em>Dynamic Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getDefs <em>Defs</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getTypes <em>Types</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getConst <em>Const</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getMultipleOf <em>Multiple Of</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getUniqueItems <em>Unique Items</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getMinContains <em>Min Contains</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getMaxContains <em>Max Contains</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getRequired <em>Required</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getMinProperties <em>Min Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getMaxProperties <em>Max Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getDependentRequired <em>Dependent Required</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getAllOf <em>All Of</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getAnyOf <em>Any Of</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getOneOf <em>One Of</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getNot <em>Not</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getIf <em>If</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getThen <em>Then</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getElse <em>Else</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getPatternProperties <em>Pattern Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getAdditionalProperties <em>Additional Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getAdditionalPropertiesBoolean <em>Additional Properties Boolean</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getUnevaluatedProperties <em>Unevaluated Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getUnevaluatedPropertiesBoolean <em>Unevaluated Properties Boolean</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getDependentSchemas <em>Dependent Schemas</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getItems <em>Items</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getItemsBoolean <em>Items Boolean</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getPrefixItems <em>Prefix Items</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getContains <em>Contains</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getUnevaluatedItems <em>Unevaluated Items</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getDefault <em>Default</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getWriteOnly <em>Write Only</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getFormat <em>Format</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getContentEncoding <em>Content Encoding</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getContentMediaType <em>Content Media Type</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.Schema#getContentSchema <em>Content Schema</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: $schema. The meta-schema URI identifying the JSON Schema dialect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema Version</em>' attribute.
	 * @see #setSchemaVersion(String)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_SchemaVersion()
	 * @model
	 * @generated
	 */
	String getSchemaVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Version</em>' attribute.
	 * @see #getSchemaVersion()
	 * @generated
	 */
	void setSchemaVersion(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: $id. The identifier URI for the schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: $anchor. A plain-name anchor identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anchor</em>' attribute.
	 * @see #setAnchor(String)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Anchor()
	 * @model
	 * @generated
	 */
	String getAnchor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getAnchor <em>Anchor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor</em>' attribute.
	 * @see #getAnchor()
	 * @generated
	 */
	void setAnchor(String value);

	/**
	 * Returns the value of the '<em><b>Dynamic Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: $dynamicAnchor. A dynamic anchor identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Anchor</em>' attribute.
	 * @see #setDynamicAnchor(String)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_DynamicAnchor()
	 * @model
	 * @generated
	 */
	String getDynamicAnchor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getDynamicAnchor <em>Dynamic Anchor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Anchor</em>' attribute.
	 * @see #getDynamicAnchor()
	 * @generated
	 */
	void setDynamicAnchor(String value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: $ref. A JSON Pointer reference to another schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Ref()
	 * @model
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Dynamic Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: $dynamicRef. A dynamic reference to another schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Ref</em>' attribute.
	 * @see #setDynamicRef(String)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_DynamicRef()
	 * @model
	 * @generated
	 */
	String getDynamicRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getDynamicRef <em>Dynamic Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Ref</em>' attribute.
	 * @see #getDynamicRef()
	 * @generated
	 */
	void setDynamicRef(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: $comment. A comment for schema authors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Defs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.json.schema.SchemaEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: $defs. Schema definitions (reusable sub-schemas).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defs</em>' containment reference list.
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Defs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchemaEntry> getDefs();

	/**
	 * Returns the value of the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When non-null, the schema is a boolean schema (true or false). Null means it is an object schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boolean Value</em>' attribute.
	 * @see #setBooleanValue(Boolean)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_BooleanValue()
	 * @model
	 * @generated
	 */
	Boolean getBooleanValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getBooleanValue <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Value</em>' attribute.
	 * @see #getBooleanValue()
	 * @generated
	 */
	void setBooleanValue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute list.
	 * The list contents are of type {@link org.nasdanika.models.json.schema.Type}.
	 * The literals are from the enumeration {@link org.nasdanika.models.json.schema.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: type. List of allowed JSON types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Types</em>' attribute list.
	 * @see org.nasdanika.models.json.schema.Type
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Types()
	 * @model
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: const. Constant value as a JSON string representation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Const</em>' attribute.
	 * @see #setConst(String)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Const()
	 * @model
	 * @generated
	 */
	String getConst();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getConst <em>Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const</em>' attribute.
	 * @see #getConst()
	 * @generated
	 */
	void setConst(String value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: enum. Enumerated values as JSON string representations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enum</em>' attribute list.
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Enum()
	 * @model
	 * @generated
	 */
	EList<String> getEnum();

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: minimum. Inclusive minimum value for numeric types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(Double)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Minimum()
	 * @model
	 * @generated
	 */
	Double getMinimum();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(Double value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: maximum. Inclusive maximum value for numeric types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(Double)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Maximum()
	 * @model
	 * @generated
	 */
	Double getMaximum();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(Double value);

	/**
	 * Returns the value of the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: exclusiveMinimum. Exclusive minimum value for numeric types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #setExclusiveMinimum(Double)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_ExclusiveMinimum()
	 * @model
	 * @generated
	 */
	Double getExclusiveMinimum();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getExclusiveMinimum <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #getExclusiveMinimum()
	 * @generated
	 */
	void setExclusiveMinimum(Double value);

	/**
	 * Returns the value of the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: exclusiveMaximum. Exclusive maximum value for numeric types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclusive Maximum</em>' attribute.
	 * @see #setExclusiveMaximum(Double)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_ExclusiveMaximum()
	 * @model
	 * @generated
	 */
	Double getExclusiveMaximum();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getExclusiveMaximum <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Maximum</em>' attribute.
	 * @see #getExclusiveMaximum()
	 * @generated
	 */
	void setExclusiveMaximum(Double value);

	/**
	 * Returns the value of the '<em><b>Multiple Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: multipleOf. The value must be a multiple of this number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiple Of</em>' attribute.
	 * @see #setMultipleOf(Double)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_MultipleOf()
	 * @model
	 * @generated
	 */
	Double getMultipleOf();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getMultipleOf <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Of</em>' attribute.
	 * @see #getMultipleOf()
	 * @generated
	 */
	void setMultipleOf(Double value);

	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: minLength. Minimum string length.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(Integer)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_MinLength()
	 * @model
	 * @generated
	 */
	Integer getMinLength();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: maxLength. Maximum string length.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(Integer)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_MaxLength()
	 * @model
	 * @generated
	 */
	Integer getMaxLength();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: pattern. Regular expression pattern for string validation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Pattern()
	 * @model
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: minItems. Minimum number of array items.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Items</em>' attribute.
	 * @see #setMinItems(Integer)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_MinItems()
	 * @model
	 * @generated
	 */
	Integer getMinItems();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getMinItems <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Items</em>' attribute.
	 * @see #getMinItems()
	 * @generated
	 */
	void setMinItems(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: maxItems. Maximum number of array items.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Items</em>' attribute.
	 * @see #setMaxItems(Integer)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_MaxItems()
	 * @model
	 * @generated
	 */
	Integer getMaxItems();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getMaxItems <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Items</em>' attribute.
	 * @see #getMaxItems()
	 * @generated
	 */
	void setMaxItems(Integer value);

	/**
	 * Returns the value of the '<em><b>Unique Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: uniqueItems. Whether array items must be unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unique Items</em>' attribute.
	 * @see #setUniqueItems(Boolean)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_UniqueItems()
	 * @model
	 * @generated
	 */
	Boolean getUniqueItems();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getUniqueItems <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Items</em>' attribute.
	 * @see #getUniqueItems()
	 * @generated
	 */
	void setUniqueItems(Boolean value);

	/**
	 * Returns the value of the '<em><b>Min Contains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: minContains. Minimum number of items matching the contains schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Contains</em>' attribute.
	 * @see #setMinContains(Integer)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_MinContains()
	 * @model
	 * @generated
	 */
	Integer getMinContains();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getMinContains <em>Min Contains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Contains</em>' attribute.
	 * @see #getMinContains()
	 * @generated
	 */
	void setMinContains(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Contains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: maxContains. Maximum number of items matching the contains schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Contains</em>' attribute.
	 * @see #setMaxContains(Integer)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_MaxContains()
	 * @model
	 * @generated
	 */
	Integer getMaxContains();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getMaxContains <em>Max Contains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Contains</em>' attribute.
	 * @see #getMaxContains()
	 * @generated
	 */
	void setMaxContains(Integer value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: required. List of required property names.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' attribute list.
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Required()
	 * @model
	 * @generated
	 */
	EList<String> getRequired();

	/**
	 * Returns the value of the '<em><b>Min Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: minProperties. Minimum number of object properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Properties</em>' attribute.
	 * @see #setMinProperties(Integer)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_MinProperties()
	 * @model
	 * @generated
	 */
	Integer getMinProperties();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getMinProperties <em>Min Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Properties</em>' attribute.
	 * @see #getMinProperties()
	 * @generated
	 */
	void setMinProperties(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: maxProperties. Maximum number of object properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Properties</em>' attribute.
	 * @see #setMaxProperties(Integer)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_MaxProperties()
	 * @model
	 * @generated
	 */
	Integer getMaxProperties();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getMaxProperties <em>Max Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Properties</em>' attribute.
	 * @see #getMaxProperties()
	 * @generated
	 */
	void setMaxProperties(Integer value);

	/**
	 * Returns the value of the '<em><b>Dependent Required</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.json.schema.StringListEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: dependentRequired. Maps property names to required dependencies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent Required</em>' containment reference list.
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_DependentRequired()
	 * @model containment="true"
	 * @generated
	 */
	EList<StringListEntry> getDependentRequired();

	/**
	 * Returns the value of the '<em><b>All Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.json.schema.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: allOf. The instance must be valid against all sub-schemas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Of</em>' containment reference list.
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_AllOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getAllOf();

	/**
	 * Returns the value of the '<em><b>Any Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.json.schema.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: anyOf. The instance must be valid against at least one sub-schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any Of</em>' containment reference list.
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_AnyOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getAnyOf();

	/**
	 * Returns the value of the '<em><b>One Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.json.schema.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: oneOf. The instance must be valid against exactly one sub-schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>One Of</em>' containment reference list.
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_OneOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getOneOf();

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: not. The instance must NOT be valid against this schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not</em>' containment reference.
	 * @see #setNot(Schema)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Not()
	 * @model containment="true"
	 * @generated
	 */
	Schema getNot();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getNot <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' containment reference.
	 * @see #getNot()
	 * @generated
	 */
	void setNot(Schema value);

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: if. Conditional schema - if this schema validates successfully, then apply 'then'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(Schema)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_If()
	 * @model containment="true"
	 * @generated
	 */
	Schema getIf();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(Schema value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: then. Applied when 'if' passes validation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(Schema)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Then()
	 * @model containment="true"
	 * @generated
	 */
	Schema getThen();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(Schema value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: else. Applied when 'if' fails validation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Schema)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Else()
	 * @model containment="true"
	 * @generated
	 */
	Schema getElse();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Schema value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.json.schema.SchemaEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: properties. Schemas for specific object properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchemaEntry> getProperties();

	/**
	 * Returns the value of the '<em><b>Pattern Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.json.schema.SchemaEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: patternProperties. Schemas for properties matching regex patterns.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Properties</em>' containment reference list.
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_PatternProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchemaEntry> getPatternProperties();

	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: additionalProperties (schema). Schema for properties not covered by 'properties' or 'patternProperties'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Properties</em>' containment reference.
	 * @see #setAdditionalProperties(Schema)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_AdditionalProperties()
	 * @model containment="true"
	 * @generated
	 */
	Schema getAdditionalProperties();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getAdditionalProperties <em>Additional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Properties</em>' containment reference.
	 * @see #getAdditionalProperties()
	 * @generated
	 */
	void setAdditionalProperties(Schema value);

	/**
	 * Returns the value of the '<em><b>Additional Properties Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: additionalProperties (boolean). Boolean value for additionalProperties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Properties Boolean</em>' attribute.
	 * @see #setAdditionalPropertiesBoolean(Boolean)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_AdditionalPropertiesBoolean()
	 * @model
	 * @generated
	 */
	Boolean getAdditionalPropertiesBoolean();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getAdditionalPropertiesBoolean <em>Additional Properties Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Properties Boolean</em>' attribute.
	 * @see #getAdditionalPropertiesBoolean()
	 * @generated
	 */
	void setAdditionalPropertiesBoolean(Boolean value);

	/**
	 * Returns the value of the '<em><b>Unevaluated Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: unevaluatedProperties (schema). Schema for properties not evaluated by adjacent keywords.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unevaluated Properties</em>' containment reference.
	 * @see #setUnevaluatedProperties(Schema)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_UnevaluatedProperties()
	 * @model containment="true"
	 * @generated
	 */
	Schema getUnevaluatedProperties();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getUnevaluatedProperties <em>Unevaluated Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unevaluated Properties</em>' containment reference.
	 * @see #getUnevaluatedProperties()
	 * @generated
	 */
	void setUnevaluatedProperties(Schema value);

	/**
	 * Returns the value of the '<em><b>Unevaluated Properties Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: unevaluatedProperties (boolean). Boolean value for unevaluatedProperties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unevaluated Properties Boolean</em>' attribute.
	 * @see #setUnevaluatedPropertiesBoolean(Boolean)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_UnevaluatedPropertiesBoolean()
	 * @model
	 * @generated
	 */
	Boolean getUnevaluatedPropertiesBoolean();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getUnevaluatedPropertiesBoolean <em>Unevaluated Properties Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unevaluated Properties Boolean</em>' attribute.
	 * @see #getUnevaluatedPropertiesBoolean()
	 * @generated
	 */
	void setUnevaluatedPropertiesBoolean(Boolean value);

	/**
	 * Returns the value of the '<em><b>Dependent Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.json.schema.SchemaEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: dependentSchemas. Schemas applied when specific properties are present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent Schemas</em>' containment reference list.
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_DependentSchemas()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchemaEntry> getDependentSchemas();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: items (schema). Schema for array items (applied to items beyond prefixItems).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(Schema)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Items()
	 * @model containment="true"
	 * @generated
	 */
	Schema getItems();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Schema value);

	/**
	 * Returns the value of the '<em><b>Items Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: items (boolean). Boolean value for items.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Items Boolean</em>' attribute.
	 * @see #setItemsBoolean(Boolean)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_ItemsBoolean()
	 * @model
	 * @generated
	 */
	Boolean getItemsBoolean();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getItemsBoolean <em>Items Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items Boolean</em>' attribute.
	 * @see #getItemsBoolean()
	 * @generated
	 */
	void setItemsBoolean(Boolean value);

	/**
	 * Returns the value of the '<em><b>Prefix Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.json.schema.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: prefixItems. Schemas for the prefix of array items (positional validation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix Items</em>' containment reference list.
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_PrefixItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getPrefixItems();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: contains. At least one array item must match this schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference.
	 * @see #setContains(Schema)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Contains()
	 * @model containment="true"
	 * @generated
	 */
	Schema getContains();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getContains <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' containment reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(Schema value);

	/**
	 * Returns the value of the '<em><b>Unevaluated Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: unevaluatedItems. Schema for array items not evaluated by prefixItems or contains.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unevaluated Items</em>' containment reference.
	 * @see #setUnevaluatedItems(Schema)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_UnevaluatedItems()
	 * @model containment="true"
	 * @generated
	 */
	Schema getUnevaluatedItems();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getUnevaluatedItems <em>Unevaluated Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unevaluated Items</em>' containment reference.
	 * @see #getUnevaluatedItems()
	 * @generated
	 */
	void setUnevaluatedItems(Schema value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: title. Human-readable short title for the schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: description. Human-readable description of the schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: default. Default value as a JSON string representation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Default()
	 * @model
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: deprecated. Indicates the schema or value is deprecated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deprecated</em>' attribute.
	 * @see #setDeprecated(Boolean)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Deprecated()
	 * @model
	 * @generated
	 */
	Boolean getDeprecated();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #getDeprecated()
	 * @generated
	 */
	void setDeprecated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: readOnly. Indicates the value is read-only.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(Boolean)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_ReadOnly()
	 * @model
	 * @generated
	 */
	Boolean getReadOnly();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #getReadOnly()
	 * @generated
	 */
	void setReadOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: writeOnly. Indicates the value is write-only.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Only</em>' attribute.
	 * @see #setWriteOnly(Boolean)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_WriteOnly()
	 * @model
	 * @generated
	 */
	Boolean getWriteOnly();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getWriteOnly <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Only</em>' attribute.
	 * @see #getWriteOnly()
	 * @generated
	 */
	void setWriteOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: examples. Example values as JSON string representations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Examples</em>' attribute list.
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Examples()
	 * @model
	 * @generated
	 */
	EList<String> getExamples();

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: format. Format identifier (e.g., 'date-time', 'email', 'uri').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Content Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: contentEncoding. Content encoding (e.g., 'base64').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Encoding</em>' attribute.
	 * @see #setContentEncoding(String)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_ContentEncoding()
	 * @model
	 * @generated
	 */
	String getContentEncoding();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getContentEncoding <em>Content Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Encoding</em>' attribute.
	 * @see #getContentEncoding()
	 * @generated
	 */
	void setContentEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Content Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: contentMediaType. Media type of the content (e.g., 'application/json').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Media Type</em>' attribute.
	 * @see #setContentMediaType(String)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_ContentMediaType()
	 * @model
	 * @generated
	 */
	String getContentMediaType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getContentMediaType <em>Content Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Media Type</em>' attribute.
	 * @see #getContentMediaType()
	 * @generated
	 */
	void setContentMediaType(String value);

	/**
	 * Returns the value of the '<em><b>Content Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON Schema keyword: contentSchema. Schema for the decoded content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Schema</em>' containment reference.
	 * @see #setContentSchema(Schema)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchema_ContentSchema()
	 * @model containment="true"
	 * @generated
	 */
	Schema getContentSchema();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getContentSchema <em>Content Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Schema</em>' containment reference.
	 * @see #getContentSchema()
	 * @generated
	 */
	void setContentSchema(Schema value);

} // Schema
