package org.nasdanika.models.json.schema;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Schema</b></em>'.
 * Represents a JSON Schema 2020-12 schema object. All features are optional.
 *
 * @see org.nasdanika.models.json.schema.JsonSchemaPackage#getSchemaClass()
 * @generated
 */
public interface Schema extends EObject {

	/**
	 * Returns the value of the '<em><b>Schema Version</b></em>' attribute.
	 * JSON Schema keyword: $schema. The meta-schema URI.
	 * @return the value of the '<em>Schema Version</em>' attribute.
	 * @see #setSchemaVersion(String)
	 * @see org.nasdanika.models.json.schema.JsonSchemaPackage#getSchema_SchemaVersion()
	 * @generated
	 */
	String getSchemaVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * @param value the new value of the '<em>Schema Version</em>' attribute.
	 * @see #getSchemaVersion()
	 * @generated
	 */
	void setSchemaVersion(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * JSON Schema keyword: $id.
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.Schema#getId <em>Id</em>}' attribute.
	 * @param value the new value.
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' attribute.
	 * JSON Schema keyword: $anchor.
	 * @generated
	 */
	String getAnchor();

	/**
	 * Sets the value of the '<em>Anchor</em>' attribute.
	 * @generated
	 */
	void setAnchor(String value);

	/**
	 * Returns the value of the '<em><b>Dynamic Anchor</b></em>' attribute.
	 * JSON Schema keyword: $dynamicAnchor.
	 * @generated
	 */
	String getDynamicAnchor();

	/**
	 * Sets the value of the '<em>Dynamic Anchor</em>' attribute.
	 * @generated
	 */
	void setDynamicAnchor(String value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * JSON Schema keyword: $ref.
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '<em>Ref</em>' attribute.
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Dynamic Ref</b></em>' attribute.
	 * JSON Schema keyword: $dynamicRef.
	 * @generated
	 */
	String getDynamicRef();

	/**
	 * Sets the value of the '<em>Dynamic Ref</em>' attribute.
	 * @generated
	 */
	void setDynamicRef(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * JSON Schema keyword: $comment.
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '<em>Comment</em>' attribute.
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Defs</b></em>' containment reference list.
	 * JSON Schema keyword: $defs.
	 * @return the value of the '<em>Defs</em>' containment reference list.
	 * @see org.nasdanika.models.json.schema.JsonSchemaPackage#getSchema_Defs()
	 * @generated
	 */
	EList<SchemaEntry> getDefs();

	/**
	 * Returns the value of the '<em><b>Boolean Value</b></em>' attribute.
	 * When non-null, the schema is a boolean schema. Null means object schema.
	 * @generated
	 */
	Boolean getBooleanValue();

	/**
	 * Sets the value of the '<em>Boolean Value</em>' attribute.
	 * @generated
	 */
	void setBooleanValue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute list.
	 * JSON Schema keyword: type.
	 * @return the value of the '<em>Types</em>' attribute list.
	 * @see org.nasdanika.models.json.schema.JsonSchemaPackage#getSchema_Types()
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Const</b></em>' attribute.
	 * JSON Schema keyword: const.
	 * @generated
	 */
	String getConst();

	/**
	 * Sets the value of the '<em>Const</em>' attribute.
	 * @generated
	 */
	void setConst(String value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute list.
	 * JSON Schema keyword: enum.
	 * @return the value of the '<em>Enum</em>' attribute list.
	 * @generated
	 */
	EList<String> getEnum();

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * JSON Schema keyword: minimum.
	 * @generated
	 */
	Double getMinimum();

	/**
	 * Sets the value of the '<em>Minimum</em>' attribute.
	 * @generated
	 */
	void setMinimum(Double value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * JSON Schema keyword: maximum.
	 * @generated
	 */
	Double getMaximum();

	/**
	 * Sets the value of the '<em>Maximum</em>' attribute.
	 * @generated
	 */
	void setMaximum(Double value);

	/**
	 * Returns the value of the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * JSON Schema keyword: exclusiveMinimum.
	 * @generated
	 */
	Double getExclusiveMinimum();

	/**
	 * Sets the value of the '<em>Exclusive Minimum</em>' attribute.
	 * @generated
	 */
	void setExclusiveMinimum(Double value);

	/**
	 * Returns the value of the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * JSON Schema keyword: exclusiveMaximum.
	 * @generated
	 */
	Double getExclusiveMaximum();

	/**
	 * Sets the value of the '<em>Exclusive Maximum</em>' attribute.
	 * @generated
	 */
	void setExclusiveMaximum(Double value);

	/**
	 * Returns the value of the '<em><b>Multiple Of</b></em>' attribute.
	 * JSON Schema keyword: multipleOf.
	 * @generated
	 */
	Double getMultipleOf();

	/**
	 * Sets the value of the '<em>Multiple Of</em>' attribute.
	 * @generated
	 */
	void setMultipleOf(Double value);

	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * JSON Schema keyword: minLength.
	 * @generated
	 */
	Integer getMinLength();

	/**
	 * Sets the value of the '<em>Min Length</em>' attribute.
	 * @generated
	 */
	void setMinLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * JSON Schema keyword: maxLength.
	 * @generated
	 */
	Integer getMaxLength();

	/**
	 * Sets the value of the '<em>Max Length</em>' attribute.
	 * @generated
	 */
	void setMaxLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * JSON Schema keyword: pattern.
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '<em>Pattern</em>' attribute.
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Min Items</b></em>' attribute.
	 * JSON Schema keyword: minItems.
	 * @generated
	 */
	Integer getMinItems();

	/**
	 * Sets the value of the '<em>Min Items</em>' attribute.
	 * @generated
	 */
	void setMinItems(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Items</b></em>' attribute.
	 * JSON Schema keyword: maxItems.
	 * @generated
	 */
	Integer getMaxItems();

	/**
	 * Sets the value of the '<em>Max Items</em>' attribute.
	 * @generated
	 */
	void setMaxItems(Integer value);

	/**
	 * Returns the value of the '<em><b>Unique Items</b></em>' attribute.
	 * JSON Schema keyword: uniqueItems.
	 * @generated
	 */
	Boolean getUniqueItems();

	/**
	 * Sets the value of the '<em>Unique Items</em>' attribute.
	 * @generated
	 */
	void setUniqueItems(Boolean value);

	/**
	 * Returns the value of the '<em><b>Min Contains</b></em>' attribute.
	 * JSON Schema keyword: minContains.
	 * @generated
	 */
	Integer getMinContains();

	/**
	 * Sets the value of the '<em>Min Contains</em>' attribute.
	 * @generated
	 */
	void setMinContains(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Contains</b></em>' attribute.
	 * JSON Schema keyword: maxContains.
	 * @generated
	 */
	Integer getMaxContains();

	/**
	 * Sets the value of the '<em>Max Contains</em>' attribute.
	 * @generated
	 */
	void setMaxContains(Integer value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute list.
	 * JSON Schema keyword: required.
	 * @generated
	 */
	EList<String> getRequired();

	/**
	 * Returns the value of the '<em><b>Min Properties</b></em>' attribute.
	 * JSON Schema keyword: minProperties.
	 * @generated
	 */
	Integer getMinProperties();

	/**
	 * Sets the value of the '<em>Min Properties</em>' attribute.
	 * @generated
	 */
	void setMinProperties(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Properties</b></em>' attribute.
	 * JSON Schema keyword: maxProperties.
	 * @generated
	 */
	Integer getMaxProperties();

	/**
	 * Sets the value of the '<em>Max Properties</em>' attribute.
	 * @generated
	 */
	void setMaxProperties(Integer value);

	/**
	 * Returns the value of the '<em><b>Dependent Required</b></em>' containment reference list.
	 * JSON Schema keyword: dependentRequired.
	 * @generated
	 */
	EList<StringListEntry> getDependentRequired();

	/**
	 * Returns the value of the '<em><b>All Of</b></em>' containment reference list.
	 * JSON Schema keyword: allOf.
	 * @generated
	 */
	EList<Schema> getAllOf();

	/**
	 * Returns the value of the '<em><b>Any Of</b></em>' containment reference list.
	 * JSON Schema keyword: anyOf.
	 * @generated
	 */
	EList<Schema> getAnyOf();

	/**
	 * Returns the value of the '<em><b>One Of</b></em>' containment reference list.
	 * JSON Schema keyword: oneOf.
	 * @generated
	 */
	EList<Schema> getOneOf();

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * JSON Schema keyword: not.
	 * @generated
	 */
	Schema getNot();

	/**
	 * Sets the value of the '<em>Not</em>' containment reference.
	 * @generated
	 */
	void setNot(Schema value);

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * JSON Schema keyword: if.
	 * @generated
	 */
	Schema getIf();

	/**
	 * Sets the value of the '<em>If</em>' containment reference.
	 * @generated
	 */
	void setIf(Schema value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * JSON Schema keyword: then.
	 * @generated
	 */
	Schema getThen();

	/**
	 * Sets the value of the '<em>Then</em>' containment reference.
	 * @generated
	 */
	void setThen(Schema value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * JSON Schema keyword: else.
	 * @generated
	 */
	Schema getElse();

	/**
	 * Sets the value of the '<em>Else</em>' containment reference.
	 * @generated
	 */
	void setElse(Schema value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * JSON Schema keyword: properties.
	 * @generated
	 */
	EList<SchemaEntry> getProperties();

	/**
	 * Returns the value of the '<em><b>Pattern Properties</b></em>' containment reference list.
	 * JSON Schema keyword: patternProperties.
	 * @generated
	 */
	EList<SchemaEntry> getPatternProperties();

	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' containment reference.
	 * JSON Schema keyword: additionalProperties (schema).
	 * @generated
	 */
	Schema getAdditionalProperties();

	/**
	 * Sets the value of the '<em>Additional Properties</em>' containment reference.
	 * @generated
	 */
	void setAdditionalProperties(Schema value);

	/**
	 * Returns the value of the '<em><b>Additional Properties Boolean</b></em>' attribute.
	 * JSON Schema keyword: additionalProperties (boolean).
	 * @generated
	 */
	Boolean getAdditionalPropertiesBoolean();

	/**
	 * Sets the value of the '<em>Additional Properties Boolean</em>' attribute.
	 * @generated
	 */
	void setAdditionalPropertiesBoolean(Boolean value);

	/**
	 * Returns the value of the '<em><b>Unevaluated Properties</b></em>' containment reference.
	 * JSON Schema keyword: unevaluatedProperties (schema).
	 * @generated
	 */
	Schema getUnevaluatedProperties();

	/**
	 * Sets the value of the '<em>Unevaluated Properties</em>' containment reference.
	 * @generated
	 */
	void setUnevaluatedProperties(Schema value);

	/**
	 * Returns the value of the '<em><b>Unevaluated Properties Boolean</b></em>' attribute.
	 * JSON Schema keyword: unevaluatedProperties (boolean).
	 * @generated
	 */
	Boolean getUnevaluatedPropertiesBoolean();

	/**
	 * Sets the value of the '<em>Unevaluated Properties Boolean</em>' attribute.
	 * @generated
	 */
	void setUnevaluatedPropertiesBoolean(Boolean value);

	/**
	 * Returns the value of the '<em><b>Dependent Schemas</b></em>' containment reference list.
	 * JSON Schema keyword: dependentSchemas.
	 * @generated
	 */
	EList<SchemaEntry> getDependentSchemas();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * JSON Schema keyword: items (schema).
	 * @generated
	 */
	Schema getItems();

	/**
	 * Sets the value of the '<em>Items</em>' containment reference.
	 * @generated
	 */
	void setItems(Schema value);

	/**
	 * Returns the value of the '<em><b>Items Boolean</b></em>' attribute.
	 * JSON Schema keyword: items (boolean).
	 * @generated
	 */
	Boolean getItemsBoolean();

	/**
	 * Sets the value of the '<em>Items Boolean</em>' attribute.
	 * @generated
	 */
	void setItemsBoolean(Boolean value);

	/**
	 * Returns the value of the '<em><b>Prefix Items</b></em>' containment reference list.
	 * JSON Schema keyword: prefixItems.
	 * @generated
	 */
	EList<Schema> getPrefixItems();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference.
	 * JSON Schema keyword: contains.
	 * @generated
	 */
	Schema getContains();

	/**
	 * Sets the value of the '<em>Contains</em>' containment reference.
	 * @generated
	 */
	void setContains(Schema value);

	/**
	 * Returns the value of the '<em><b>Unevaluated Items</b></em>' containment reference.
	 * JSON Schema keyword: unevaluatedItems.
	 * @generated
	 */
	Schema getUnevaluatedItems();

	/**
	 * Sets the value of the '<em>Unevaluated Items</em>' containment reference.
	 * @generated
	 */
	void setUnevaluatedItems(Schema value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * JSON Schema keyword: title.
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '<em>Title</em>' attribute.
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * JSON Schema keyword: description.
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '<em>Description</em>' attribute.
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * JSON Schema keyword: default.
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '<em>Default</em>' attribute.
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
	 * JSON Schema keyword: deprecated.
	 * @generated
	 */
	Boolean getDeprecated();

	/**
	 * Sets the value of the '<em>Deprecated</em>' attribute.
	 * @generated
	 */
	void setDeprecated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * JSON Schema keyword: readOnly.
	 * @generated
	 */
	Boolean getReadOnly();

	/**
	 * Sets the value of the '<em>Read Only</em>' attribute.
	 * @generated
	 */
	void setReadOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Write Only</b></em>' attribute.
	 * JSON Schema keyword: writeOnly.
	 * @generated
	 */
	Boolean getWriteOnly();

	/**
	 * Sets the value of the '<em>Write Only</em>' attribute.
	 * @generated
	 */
	void setWriteOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' attribute list.
	 * JSON Schema keyword: examples.
	 * @generated
	 */
	EList<String> getExamples();

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * JSON Schema keyword: format.
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '<em>Format</em>' attribute.
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Content Encoding</b></em>' attribute.
	 * JSON Schema keyword: contentEncoding.
	 * @generated
	 */
	String getContentEncoding();

	/**
	 * Sets the value of the '<em>Content Encoding</em>' attribute.
	 * @generated
	 */
	void setContentEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Content Media Type</b></em>' attribute.
	 * JSON Schema keyword: contentMediaType.
	 * @generated
	 */
	String getContentMediaType();

	/**
	 * Sets the value of the '<em>Content Media Type</em>' attribute.
	 * @generated
	 */
	void setContentMediaType(String value);

	/**
	 * Returns the value of the '<em><b>Content Schema</b></em>' containment reference.
	 * JSON Schema keyword: contentSchema.
	 * @generated
	 */
	Schema getContentSchema();

	/**
	 * Sets the value of the '<em>Content Schema</em>' containment reference.
	 * @generated
	 */
	void setContentSchema(Schema value);

} //Schema
