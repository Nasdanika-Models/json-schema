package org.nasdanika.models.json.schema.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.json.schema.JsonSchemaPackage;
import org.nasdanika.models.json.schema.Schema;
import org.nasdanika.models.json.schema.SchemaEntry;
import org.nasdanika.models.json.schema.StringListEntry;
import org.nasdanika.models.json.schema.Type;

/**
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * @generated
 */
public class SchemaImpl extends MinimalEObjectImpl.Container implements Schema {

	/**
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonSchemaPackage.Literals.SCHEMA;
	}

	/**
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	@Override
	public String getSchemaVersion() {
		return (String) eDynamicGet(JsonSchemaPackage.SCHEMA__SCHEMA_VERSION, JsonSchemaPackage.Literals.SCHEMA__SCHEMA_VERSION, true, true);
	}

	@Override
	public void setSchemaVersion(String newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__SCHEMA_VERSION, JsonSchemaPackage.Literals.SCHEMA__SCHEMA_VERSION, newValue);
	}

	@Override
	public String getId() {
		return (String) eDynamicGet(JsonSchemaPackage.SCHEMA__ID, JsonSchemaPackage.Literals.SCHEMA__ID, true, true);
	}

	@Override
	public void setId(String newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__ID, JsonSchemaPackage.Literals.SCHEMA__ID, newValue);
	}

	@Override
	public String getAnchor() {
		return (String) eDynamicGet(JsonSchemaPackage.SCHEMA__ANCHOR, JsonSchemaPackage.Literals.SCHEMA__ANCHOR, true, true);
	}

	@Override
	public void setAnchor(String newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__ANCHOR, JsonSchemaPackage.Literals.SCHEMA__ANCHOR, newValue);
	}

	@Override
	public String getDynamicAnchor() {
		return (String) eDynamicGet(JsonSchemaPackage.SCHEMA__DYNAMIC_ANCHOR, JsonSchemaPackage.Literals.SCHEMA__DYNAMIC_ANCHOR, true, true);
	}

	@Override
	public void setDynamicAnchor(String newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__DYNAMIC_ANCHOR, JsonSchemaPackage.Literals.SCHEMA__DYNAMIC_ANCHOR, newValue);
	}

	@Override
	public String getRef() {
		return (String) eDynamicGet(JsonSchemaPackage.SCHEMA__REF, JsonSchemaPackage.Literals.SCHEMA__REF, true, true);
	}

	@Override
	public void setRef(String newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__REF, JsonSchemaPackage.Literals.SCHEMA__REF, newValue);
	}

	@Override
	public String getDynamicRef() {
		return (String) eDynamicGet(JsonSchemaPackage.SCHEMA__DYNAMIC_REF, JsonSchemaPackage.Literals.SCHEMA__DYNAMIC_REF, true, true);
	}

	@Override
	public void setDynamicRef(String newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__DYNAMIC_REF, JsonSchemaPackage.Literals.SCHEMA__DYNAMIC_REF, newValue);
	}

	@Override
	public String getComment() {
		return (String) eDynamicGet(JsonSchemaPackage.SCHEMA__COMMENT, JsonSchemaPackage.Literals.SCHEMA__COMMENT, true, true);
	}

	@Override
	public void setComment(String newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__COMMENT, JsonSchemaPackage.Literals.SCHEMA__COMMENT, newValue);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<SchemaEntry> getDefs() {
		return (EList<SchemaEntry>) eDynamicGet(JsonSchemaPackage.SCHEMA__DEFS, JsonSchemaPackage.Literals.SCHEMA__DEFS, true, true);
	}

	@Override
	public Boolean getBooleanValue() {
		return (Boolean) eDynamicGet(JsonSchemaPackage.SCHEMA__BOOLEAN_VALUE, JsonSchemaPackage.Literals.SCHEMA__BOOLEAN_VALUE, true, true);
	}

	@Override
	public void setBooleanValue(Boolean newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__BOOLEAN_VALUE, JsonSchemaPackage.Literals.SCHEMA__BOOLEAN_VALUE, newValue);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<Type> getTypes() {
		return (EList<Type>) eDynamicGet(JsonSchemaPackage.SCHEMA__TYPES, JsonSchemaPackage.Literals.SCHEMA__TYPES, true, true);
	}

	@Override
	public String getConst() {
		return (String) eDynamicGet(JsonSchemaPackage.SCHEMA__CONST, JsonSchemaPackage.Literals.SCHEMA__CONST, true, true);
	}

	@Override
	public void setConst(String newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__CONST, JsonSchemaPackage.Literals.SCHEMA__CONST, newValue);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getEnum() {
		return (EList<String>) eDynamicGet(JsonSchemaPackage.SCHEMA__ENUM, JsonSchemaPackage.Literals.SCHEMA__ENUM, true, true);
	}

	@Override
	public Double getMinimum() {
		return (Double) eDynamicGet(JsonSchemaPackage.SCHEMA__MINIMUM, JsonSchemaPackage.Literals.SCHEMA__MINIMUM, true, true);
	}

	@Override
	public void setMinimum(Double newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__MINIMUM, JsonSchemaPackage.Literals.SCHEMA__MINIMUM, newValue);
	}

	@Override
	public Double getMaximum() {
		return (Double) eDynamicGet(JsonSchemaPackage.SCHEMA__MAXIMUM, JsonSchemaPackage.Literals.SCHEMA__MAXIMUM, true, true);
	}

	@Override
	public void setMaximum(Double newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__MAXIMUM, JsonSchemaPackage.Literals.SCHEMA__MAXIMUM, newValue);
	}

	@Override
	public Double getExclusiveMinimum() {
		return (Double) eDynamicGet(JsonSchemaPackage.SCHEMA__EXCLUSIVE_MINIMUM, JsonSchemaPackage.Literals.SCHEMA__EXCLUSIVE_MINIMUM, true, true);
	}

	@Override
	public void setExclusiveMinimum(Double newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__EXCLUSIVE_MINIMUM, JsonSchemaPackage.Literals.SCHEMA__EXCLUSIVE_MINIMUM, newValue);
	}

	@Override
	public Double getExclusiveMaximum() {
		return (Double) eDynamicGet(JsonSchemaPackage.SCHEMA__EXCLUSIVE_MAXIMUM, JsonSchemaPackage.Literals.SCHEMA__EXCLUSIVE_MAXIMUM, true, true);
	}

	@Override
	public void setExclusiveMaximum(Double newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__EXCLUSIVE_MAXIMUM, JsonSchemaPackage.Literals.SCHEMA__EXCLUSIVE_MAXIMUM, newValue);
	}

	@Override
	public Double getMultipleOf() {
		return (Double) eDynamicGet(JsonSchemaPackage.SCHEMA__MULTIPLE_OF, JsonSchemaPackage.Literals.SCHEMA__MULTIPLE_OF, true, true);
	}

	@Override
	public void setMultipleOf(Double newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__MULTIPLE_OF, JsonSchemaPackage.Literals.SCHEMA__MULTIPLE_OF, newValue);
	}

	@Override
	public Integer getMinLength() {
		return (Integer) eDynamicGet(JsonSchemaPackage.SCHEMA__MIN_LENGTH, JsonSchemaPackage.Literals.SCHEMA__MIN_LENGTH, true, true);
	}

	@Override
	public void setMinLength(Integer newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__MIN_LENGTH, JsonSchemaPackage.Literals.SCHEMA__MIN_LENGTH, newValue);
	}

	@Override
	public Integer getMaxLength() {
		return (Integer) eDynamicGet(JsonSchemaPackage.SCHEMA__MAX_LENGTH, JsonSchemaPackage.Literals.SCHEMA__MAX_LENGTH, true, true);
	}

	@Override
	public void setMaxLength(Integer newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__MAX_LENGTH, JsonSchemaPackage.Literals.SCHEMA__MAX_LENGTH, newValue);
	}

	@Override
	public String getPattern() {
		return (String) eDynamicGet(JsonSchemaPackage.SCHEMA__PATTERN, JsonSchemaPackage.Literals.SCHEMA__PATTERN, true, true);
	}

	@Override
	public void setPattern(String newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__PATTERN, JsonSchemaPackage.Literals.SCHEMA__PATTERN, newValue);
	}

	@Override
	public Integer getMinItems() {
		return (Integer) eDynamicGet(JsonSchemaPackage.SCHEMA__MIN_ITEMS, JsonSchemaPackage.Literals.SCHEMA__MIN_ITEMS, true, true);
	}

	@Override
	public void setMinItems(Integer newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__MIN_ITEMS, JsonSchemaPackage.Literals.SCHEMA__MIN_ITEMS, newValue);
	}

	@Override
	public Integer getMaxItems() {
		return (Integer) eDynamicGet(JsonSchemaPackage.SCHEMA__MAX_ITEMS, JsonSchemaPackage.Literals.SCHEMA__MAX_ITEMS, true, true);
	}

	@Override
	public void setMaxItems(Integer newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__MAX_ITEMS, JsonSchemaPackage.Literals.SCHEMA__MAX_ITEMS, newValue);
	}

	@Override
	public Boolean getUniqueItems() {
		return (Boolean) eDynamicGet(JsonSchemaPackage.SCHEMA__UNIQUE_ITEMS, JsonSchemaPackage.Literals.SCHEMA__UNIQUE_ITEMS, true, true);
	}

	@Override
	public void setUniqueItems(Boolean newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__UNIQUE_ITEMS, JsonSchemaPackage.Literals.SCHEMA__UNIQUE_ITEMS, newValue);
	}

	@Override
	public Integer getMinContains() {
		return (Integer) eDynamicGet(JsonSchemaPackage.SCHEMA__MIN_CONTAINS, JsonSchemaPackage.Literals.SCHEMA__MIN_CONTAINS, true, true);
	}

	@Override
	public void setMinContains(Integer newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__MIN_CONTAINS, JsonSchemaPackage.Literals.SCHEMA__MIN_CONTAINS, newValue);
	}

	@Override
	public Integer getMaxContains() {
		return (Integer) eDynamicGet(JsonSchemaPackage.SCHEMA__MAX_CONTAINS, JsonSchemaPackage.Literals.SCHEMA__MAX_CONTAINS, true, true);
	}

	@Override
	public void setMaxContains(Integer newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__MAX_CONTAINS, JsonSchemaPackage.Literals.SCHEMA__MAX_CONTAINS, newValue);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getRequired() {
		return (EList<String>) eDynamicGet(JsonSchemaPackage.SCHEMA__REQUIRED, JsonSchemaPackage.Literals.SCHEMA__REQUIRED, true, true);
	}

	@Override
	public Integer getMinProperties() {
		return (Integer) eDynamicGet(JsonSchemaPackage.SCHEMA__MIN_PROPERTIES, JsonSchemaPackage.Literals.SCHEMA__MIN_PROPERTIES, true, true);
	}

	@Override
	public void setMinProperties(Integer newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__MIN_PROPERTIES, JsonSchemaPackage.Literals.SCHEMA__MIN_PROPERTIES, newValue);
	}

	@Override
	public Integer getMaxProperties() {
		return (Integer) eDynamicGet(JsonSchemaPackage.SCHEMA__MAX_PROPERTIES, JsonSchemaPackage.Literals.SCHEMA__MAX_PROPERTIES, true, true);
	}

	@Override
	public void setMaxProperties(Integer newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__MAX_PROPERTIES, JsonSchemaPackage.Literals.SCHEMA__MAX_PROPERTIES, newValue);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<StringListEntry> getDependentRequired() {
		return (EList<StringListEntry>) eDynamicGet(JsonSchemaPackage.SCHEMA__DEPENDENT_REQUIRED, JsonSchemaPackage.Literals.SCHEMA__DEPENDENT_REQUIRED, true, true);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<Schema> getAllOf() {
		return (EList<Schema>) eDynamicGet(JsonSchemaPackage.SCHEMA__ALL_OF, JsonSchemaPackage.Literals.SCHEMA__ALL_OF, true, true);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<Schema> getAnyOf() {
		return (EList<Schema>) eDynamicGet(JsonSchemaPackage.SCHEMA__ANY_OF, JsonSchemaPackage.Literals.SCHEMA__ANY_OF, true, true);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<Schema> getOneOf() {
		return (EList<Schema>) eDynamicGet(JsonSchemaPackage.SCHEMA__ONE_OF, JsonSchemaPackage.Literals.SCHEMA__ONE_OF, true, true);
	}

	@Override
	public Schema getNot() {
		return (Schema) eDynamicGet(JsonSchemaPackage.SCHEMA__NOT, JsonSchemaPackage.Literals.SCHEMA__NOT, true, true);
	}

	@Override
	public void setNot(Schema newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__NOT, JsonSchemaPackage.Literals.SCHEMA__NOT, newValue);
	}

	@Override
	public Schema getIf() {
		return (Schema) eDynamicGet(JsonSchemaPackage.SCHEMA__IF, JsonSchemaPackage.Literals.SCHEMA__IF, true, true);
	}

	@Override
	public void setIf(Schema newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__IF, JsonSchemaPackage.Literals.SCHEMA__IF, newValue);
	}

	@Override
	public Schema getThen() {
		return (Schema) eDynamicGet(JsonSchemaPackage.SCHEMA__THEN, JsonSchemaPackage.Literals.SCHEMA__THEN, true, true);
	}

	@Override
	public void setThen(Schema newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__THEN, JsonSchemaPackage.Literals.SCHEMA__THEN, newValue);
	}

	@Override
	public Schema getElse() {
		return (Schema) eDynamicGet(JsonSchemaPackage.SCHEMA__ELSE, JsonSchemaPackage.Literals.SCHEMA__ELSE, true, true);
	}

	@Override
	public void setElse(Schema newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__ELSE, JsonSchemaPackage.Literals.SCHEMA__ELSE, newValue);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<SchemaEntry> getProperties() {
		return (EList<SchemaEntry>) eDynamicGet(JsonSchemaPackage.SCHEMA__PROPERTIES, JsonSchemaPackage.Literals.SCHEMA__PROPERTIES, true, true);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<SchemaEntry> getPatternProperties() {
		return (EList<SchemaEntry>) eDynamicGet(JsonSchemaPackage.SCHEMA__PATTERN_PROPERTIES, JsonSchemaPackage.Literals.SCHEMA__PATTERN_PROPERTIES, true, true);
	}

	@Override
	public Schema getAdditionalProperties() {
		return (Schema) eDynamicGet(JsonSchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES, JsonSchemaPackage.Literals.SCHEMA__ADDITIONAL_PROPERTIES, true, true);
	}

	@Override
	public void setAdditionalProperties(Schema newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES, JsonSchemaPackage.Literals.SCHEMA__ADDITIONAL_PROPERTIES, newValue);
	}

	@Override
	public Boolean getAdditionalPropertiesBoolean() {
		return (Boolean) eDynamicGet(JsonSchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN, JsonSchemaPackage.Literals.SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN, true, true);
	}

	@Override
	public void setAdditionalPropertiesBoolean(Boolean newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN, JsonSchemaPackage.Literals.SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN, newValue);
	}

	@Override
	public Schema getUnevaluatedProperties() {
		return (Schema) eDynamicGet(JsonSchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES, JsonSchemaPackage.Literals.SCHEMA__UNEVALUATED_PROPERTIES, true, true);
	}

	@Override
	public void setUnevaluatedProperties(Schema newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES, JsonSchemaPackage.Literals.SCHEMA__UNEVALUATED_PROPERTIES, newValue);
	}

	@Override
	public Boolean getUnevaluatedPropertiesBoolean() {
		return (Boolean) eDynamicGet(JsonSchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN, JsonSchemaPackage.Literals.SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN, true, true);
	}

	@Override
	public void setUnevaluatedPropertiesBoolean(Boolean newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN, JsonSchemaPackage.Literals.SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN, newValue);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<SchemaEntry> getDependentSchemas() {
		return (EList<SchemaEntry>) eDynamicGet(JsonSchemaPackage.SCHEMA__DEPENDENT_SCHEMAS, JsonSchemaPackage.Literals.SCHEMA__DEPENDENT_SCHEMAS, true, true);
	}

	@Override
	public Schema getItems() {
		return (Schema) eDynamicGet(JsonSchemaPackage.SCHEMA__ITEMS, JsonSchemaPackage.Literals.SCHEMA__ITEMS, true, true);
	}

	@Override
	public void setItems(Schema newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__ITEMS, JsonSchemaPackage.Literals.SCHEMA__ITEMS, newValue);
	}

	@Override
	public Boolean getItemsBoolean() {
		return (Boolean) eDynamicGet(JsonSchemaPackage.SCHEMA__ITEMS_BOOLEAN, JsonSchemaPackage.Literals.SCHEMA__ITEMS_BOOLEAN, true, true);
	}

	@Override
	public void setItemsBoolean(Boolean newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__ITEMS_BOOLEAN, JsonSchemaPackage.Literals.SCHEMA__ITEMS_BOOLEAN, newValue);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<Schema> getPrefixItems() {
		return (EList<Schema>) eDynamicGet(JsonSchemaPackage.SCHEMA__PREFIX_ITEMS, JsonSchemaPackage.Literals.SCHEMA__PREFIX_ITEMS, true, true);
	}

	@Override
	public Schema getContains() {
		return (Schema) eDynamicGet(JsonSchemaPackage.SCHEMA__CONTAINS, JsonSchemaPackage.Literals.SCHEMA__CONTAINS, true, true);
	}

	@Override
	public void setContains(Schema newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__CONTAINS, JsonSchemaPackage.Literals.SCHEMA__CONTAINS, newValue);
	}

	@Override
	public Schema getUnevaluatedItems() {
		return (Schema) eDynamicGet(JsonSchemaPackage.SCHEMA__UNEVALUATED_ITEMS, JsonSchemaPackage.Literals.SCHEMA__UNEVALUATED_ITEMS, true, true);
	}

	@Override
	public void setUnevaluatedItems(Schema newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__UNEVALUATED_ITEMS, JsonSchemaPackage.Literals.SCHEMA__UNEVALUATED_ITEMS, newValue);
	}

	@Override
	public String getTitle() {
		return (String) eDynamicGet(JsonSchemaPackage.SCHEMA__TITLE, JsonSchemaPackage.Literals.SCHEMA__TITLE, true, true);
	}

	@Override
	public void setTitle(String newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__TITLE, JsonSchemaPackage.Literals.SCHEMA__TITLE, newValue);
	}

	@Override
	public String getDescription() {
		return (String) eDynamicGet(JsonSchemaPackage.SCHEMA__DESCRIPTION, JsonSchemaPackage.Literals.SCHEMA__DESCRIPTION, true, true);
	}

	@Override
	public void setDescription(String newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__DESCRIPTION, JsonSchemaPackage.Literals.SCHEMA__DESCRIPTION, newValue);
	}

	@Override
	public String getDefault() {
		return (String) eDynamicGet(JsonSchemaPackage.SCHEMA__DEFAULT, JsonSchemaPackage.Literals.SCHEMA__DEFAULT, true, true);
	}

	@Override
	public void setDefault(String newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__DEFAULT, JsonSchemaPackage.Literals.SCHEMA__DEFAULT, newValue);
	}

	@Override
	public Boolean getDeprecated() {
		return (Boolean) eDynamicGet(JsonSchemaPackage.SCHEMA__DEPRECATED, JsonSchemaPackage.Literals.SCHEMA__DEPRECATED, true, true);
	}

	@Override
	public void setDeprecated(Boolean newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__DEPRECATED, JsonSchemaPackage.Literals.SCHEMA__DEPRECATED, newValue);
	}

	@Override
	public Boolean getReadOnly() {
		return (Boolean) eDynamicGet(JsonSchemaPackage.SCHEMA__READ_ONLY, JsonSchemaPackage.Literals.SCHEMA__READ_ONLY, true, true);
	}

	@Override
	public void setReadOnly(Boolean newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__READ_ONLY, JsonSchemaPackage.Literals.SCHEMA__READ_ONLY, newValue);
	}

	@Override
	public Boolean getWriteOnly() {
		return (Boolean) eDynamicGet(JsonSchemaPackage.SCHEMA__WRITE_ONLY, JsonSchemaPackage.Literals.SCHEMA__WRITE_ONLY, true, true);
	}

	@Override
	public void setWriteOnly(Boolean newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__WRITE_ONLY, JsonSchemaPackage.Literals.SCHEMA__WRITE_ONLY, newValue);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getExamples() {
		return (EList<String>) eDynamicGet(JsonSchemaPackage.SCHEMA__EXAMPLES, JsonSchemaPackage.Literals.SCHEMA__EXAMPLES, true, true);
	}

	@Override
	public String getFormat() {
		return (String) eDynamicGet(JsonSchemaPackage.SCHEMA__FORMAT, JsonSchemaPackage.Literals.SCHEMA__FORMAT, true, true);
	}

	@Override
	public void setFormat(String newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__FORMAT, JsonSchemaPackage.Literals.SCHEMA__FORMAT, newValue);
	}

	@Override
	public String getContentEncoding() {
		return (String) eDynamicGet(JsonSchemaPackage.SCHEMA__CONTENT_ENCODING, JsonSchemaPackage.Literals.SCHEMA__CONTENT_ENCODING, true, true);
	}

	@Override
	public void setContentEncoding(String newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__CONTENT_ENCODING, JsonSchemaPackage.Literals.SCHEMA__CONTENT_ENCODING, newValue);
	}

	@Override
	public String getContentMediaType() {
		return (String) eDynamicGet(JsonSchemaPackage.SCHEMA__CONTENT_MEDIA_TYPE, JsonSchemaPackage.Literals.SCHEMA__CONTENT_MEDIA_TYPE, true, true);
	}

	@Override
	public void setContentMediaType(String newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__CONTENT_MEDIA_TYPE, JsonSchemaPackage.Literals.SCHEMA__CONTENT_MEDIA_TYPE, newValue);
	}

	@Override
	public Schema getContentSchema() {
		return (Schema) eDynamicGet(JsonSchemaPackage.SCHEMA__CONTENT_SCHEMA, JsonSchemaPackage.Literals.SCHEMA__CONTENT_SCHEMA, true, true);
	}

	@Override
	public void setContentSchema(Schema newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA__CONTENT_SCHEMA, JsonSchemaPackage.Literals.SCHEMA__CONTENT_SCHEMA, newValue);
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JsonSchemaPackage.SCHEMA__DEFS:
				return ((InternalEList<?>) getDefs()).basicRemove(otherEnd, msgs);
			case JsonSchemaPackage.SCHEMA__DEPENDENT_REQUIRED:
				return ((InternalEList<?>) getDependentRequired()).basicRemove(otherEnd, msgs);
			case JsonSchemaPackage.SCHEMA__ALL_OF:
				return ((InternalEList<?>) getAllOf()).basicRemove(otherEnd, msgs);
			case JsonSchemaPackage.SCHEMA__ANY_OF:
				return ((InternalEList<?>) getAnyOf()).basicRemove(otherEnd, msgs);
			case JsonSchemaPackage.SCHEMA__ONE_OF:
				return ((InternalEList<?>) getOneOf()).basicRemove(otherEnd, msgs);
			case JsonSchemaPackage.SCHEMA__NOT:
				return eDynamicInverseRemove(otherEnd, EOPPOSITE_FEATURE_BASE - JsonSchemaPackage.SCHEMA__NOT, null, msgs);
			case JsonSchemaPackage.SCHEMA__IF:
				return eDynamicInverseRemove(otherEnd, EOPPOSITE_FEATURE_BASE - JsonSchemaPackage.SCHEMA__IF, null, msgs);
			case JsonSchemaPackage.SCHEMA__THEN:
				return eDynamicInverseRemove(otherEnd, EOPPOSITE_FEATURE_BASE - JsonSchemaPackage.SCHEMA__THEN, null, msgs);
			case JsonSchemaPackage.SCHEMA__ELSE:
				return eDynamicInverseRemove(otherEnd, EOPPOSITE_FEATURE_BASE - JsonSchemaPackage.SCHEMA__ELSE, null, msgs);
			case JsonSchemaPackage.SCHEMA__PROPERTIES:
				return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
			case JsonSchemaPackage.SCHEMA__PATTERN_PROPERTIES:
				return ((InternalEList<?>) getPatternProperties()).basicRemove(otherEnd, msgs);
			case JsonSchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES:
				return eDynamicInverseRemove(otherEnd, EOPPOSITE_FEATURE_BASE - JsonSchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES, null, msgs);
			case JsonSchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES:
				return eDynamicInverseRemove(otherEnd, EOPPOSITE_FEATURE_BASE - JsonSchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES, null, msgs);
			case JsonSchemaPackage.SCHEMA__DEPENDENT_SCHEMAS:
				return ((InternalEList<?>) getDependentSchemas()).basicRemove(otherEnd, msgs);
			case JsonSchemaPackage.SCHEMA__ITEMS:
				return eDynamicInverseRemove(otherEnd, EOPPOSITE_FEATURE_BASE - JsonSchemaPackage.SCHEMA__ITEMS, null, msgs);
			case JsonSchemaPackage.SCHEMA__PREFIX_ITEMS:
				return ((InternalEList<?>) getPrefixItems()).basicRemove(otherEnd, msgs);
			case JsonSchemaPackage.SCHEMA__CONTAINS:
				return eDynamicInverseRemove(otherEnd, EOPPOSITE_FEATURE_BASE - JsonSchemaPackage.SCHEMA__CONTAINS, null, msgs);
			case JsonSchemaPackage.SCHEMA__UNEVALUATED_ITEMS:
				return eDynamicInverseRemove(otherEnd, EOPPOSITE_FEATURE_BASE - JsonSchemaPackage.SCHEMA__UNEVALUATED_ITEMS, null, msgs);
			case JsonSchemaPackage.SCHEMA__CONTENT_SCHEMA:
				return eDynamicInverseRemove(otherEnd, EOPPOSITE_FEATURE_BASE - JsonSchemaPackage.SCHEMA__CONTENT_SCHEMA, null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JsonSchemaPackage.SCHEMA__SCHEMA_VERSION: return getSchemaVersion();
			case JsonSchemaPackage.SCHEMA__ID: return getId();
			case JsonSchemaPackage.SCHEMA__ANCHOR: return getAnchor();
			case JsonSchemaPackage.SCHEMA__DYNAMIC_ANCHOR: return getDynamicAnchor();
			case JsonSchemaPackage.SCHEMA__REF: return getRef();
			case JsonSchemaPackage.SCHEMA__DYNAMIC_REF: return getDynamicRef();
			case JsonSchemaPackage.SCHEMA__COMMENT: return getComment();
			case JsonSchemaPackage.SCHEMA__DEFS: return getDefs();
			case JsonSchemaPackage.SCHEMA__BOOLEAN_VALUE: return getBooleanValue();
			case JsonSchemaPackage.SCHEMA__TYPES: return getTypes();
			case JsonSchemaPackage.SCHEMA__CONST: return getConst();
			case JsonSchemaPackage.SCHEMA__ENUM: return getEnum();
			case JsonSchemaPackage.SCHEMA__MINIMUM: return getMinimum();
			case JsonSchemaPackage.SCHEMA__MAXIMUM: return getMaximum();
			case JsonSchemaPackage.SCHEMA__EXCLUSIVE_MINIMUM: return getExclusiveMinimum();
			case JsonSchemaPackage.SCHEMA__EXCLUSIVE_MAXIMUM: return getExclusiveMaximum();
			case JsonSchemaPackage.SCHEMA__MULTIPLE_OF: return getMultipleOf();
			case JsonSchemaPackage.SCHEMA__MIN_LENGTH: return getMinLength();
			case JsonSchemaPackage.SCHEMA__MAX_LENGTH: return getMaxLength();
			case JsonSchemaPackage.SCHEMA__PATTERN: return getPattern();
			case JsonSchemaPackage.SCHEMA__MIN_ITEMS: return getMinItems();
			case JsonSchemaPackage.SCHEMA__MAX_ITEMS: return getMaxItems();
			case JsonSchemaPackage.SCHEMA__UNIQUE_ITEMS: return getUniqueItems();
			case JsonSchemaPackage.SCHEMA__MIN_CONTAINS: return getMinContains();
			case JsonSchemaPackage.SCHEMA__MAX_CONTAINS: return getMaxContains();
			case JsonSchemaPackage.SCHEMA__REQUIRED: return getRequired();
			case JsonSchemaPackage.SCHEMA__MIN_PROPERTIES: return getMinProperties();
			case JsonSchemaPackage.SCHEMA__MAX_PROPERTIES: return getMaxProperties();
			case JsonSchemaPackage.SCHEMA__DEPENDENT_REQUIRED: return getDependentRequired();
			case JsonSchemaPackage.SCHEMA__ALL_OF: return getAllOf();
			case JsonSchemaPackage.SCHEMA__ANY_OF: return getAnyOf();
			case JsonSchemaPackage.SCHEMA__ONE_OF: return getOneOf();
			case JsonSchemaPackage.SCHEMA__NOT: return getNot();
			case JsonSchemaPackage.SCHEMA__IF: return getIf();
			case JsonSchemaPackage.SCHEMA__THEN: return getThen();
			case JsonSchemaPackage.SCHEMA__ELSE: return getElse();
			case JsonSchemaPackage.SCHEMA__PROPERTIES: return getProperties();
			case JsonSchemaPackage.SCHEMA__PATTERN_PROPERTIES: return getPatternProperties();
			case JsonSchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES: return getAdditionalProperties();
			case JsonSchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN: return getAdditionalPropertiesBoolean();
			case JsonSchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES: return getUnevaluatedProperties();
			case JsonSchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN: return getUnevaluatedPropertiesBoolean();
			case JsonSchemaPackage.SCHEMA__DEPENDENT_SCHEMAS: return getDependentSchemas();
			case JsonSchemaPackage.SCHEMA__ITEMS: return getItems();
			case JsonSchemaPackage.SCHEMA__ITEMS_BOOLEAN: return getItemsBoolean();
			case JsonSchemaPackage.SCHEMA__PREFIX_ITEMS: return getPrefixItems();
			case JsonSchemaPackage.SCHEMA__CONTAINS: return getContains();
			case JsonSchemaPackage.SCHEMA__UNEVALUATED_ITEMS: return getUnevaluatedItems();
			case JsonSchemaPackage.SCHEMA__TITLE: return getTitle();
			case JsonSchemaPackage.SCHEMA__DESCRIPTION: return getDescription();
			case JsonSchemaPackage.SCHEMA__DEFAULT: return getDefault();
			case JsonSchemaPackage.SCHEMA__DEPRECATED: return getDeprecated();
			case JsonSchemaPackage.SCHEMA__READ_ONLY: return getReadOnly();
			case JsonSchemaPackage.SCHEMA__WRITE_ONLY: return getWriteOnly();
			case JsonSchemaPackage.SCHEMA__EXAMPLES: return getExamples();
			case JsonSchemaPackage.SCHEMA__FORMAT: return getFormat();
			case JsonSchemaPackage.SCHEMA__CONTENT_ENCODING: return getContentEncoding();
			case JsonSchemaPackage.SCHEMA__CONTENT_MEDIA_TYPE: return getContentMediaType();
			case JsonSchemaPackage.SCHEMA__CONTENT_SCHEMA: return getContentSchema();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JsonSchemaPackage.SCHEMA__SCHEMA_VERSION: setSchemaVersion((String) newValue); return;
			case JsonSchemaPackage.SCHEMA__ID: setId((String) newValue); return;
			case JsonSchemaPackage.SCHEMA__ANCHOR: setAnchor((String) newValue); return;
			case JsonSchemaPackage.SCHEMA__DYNAMIC_ANCHOR: setDynamicAnchor((String) newValue); return;
			case JsonSchemaPackage.SCHEMA__REF: setRef((String) newValue); return;
			case JsonSchemaPackage.SCHEMA__DYNAMIC_REF: setDynamicRef((String) newValue); return;
			case JsonSchemaPackage.SCHEMA__COMMENT: setComment((String) newValue); return;
			case JsonSchemaPackage.SCHEMA__DEFS: getDefs().clear(); getDefs().addAll((Collection<? extends SchemaEntry>) newValue); return;
			case JsonSchemaPackage.SCHEMA__BOOLEAN_VALUE: setBooleanValue((Boolean) newValue); return;
			case JsonSchemaPackage.SCHEMA__TYPES: getTypes().clear(); getTypes().addAll((Collection<? extends Type>) newValue); return;
			case JsonSchemaPackage.SCHEMA__CONST: setConst((String) newValue); return;
			case JsonSchemaPackage.SCHEMA__ENUM: getEnum().clear(); getEnum().addAll((Collection<? extends String>) newValue); return;
			case JsonSchemaPackage.SCHEMA__MINIMUM: setMinimum((Double) newValue); return;
			case JsonSchemaPackage.SCHEMA__MAXIMUM: setMaximum((Double) newValue); return;
			case JsonSchemaPackage.SCHEMA__EXCLUSIVE_MINIMUM: setExclusiveMinimum((Double) newValue); return;
			case JsonSchemaPackage.SCHEMA__EXCLUSIVE_MAXIMUM: setExclusiveMaximum((Double) newValue); return;
			case JsonSchemaPackage.SCHEMA__MULTIPLE_OF: setMultipleOf((Double) newValue); return;
			case JsonSchemaPackage.SCHEMA__MIN_LENGTH: setMinLength((Integer) newValue); return;
			case JsonSchemaPackage.SCHEMA__MAX_LENGTH: setMaxLength((Integer) newValue); return;
			case JsonSchemaPackage.SCHEMA__PATTERN: setPattern((String) newValue); return;
			case JsonSchemaPackage.SCHEMA__MIN_ITEMS: setMinItems((Integer) newValue); return;
			case JsonSchemaPackage.SCHEMA__MAX_ITEMS: setMaxItems((Integer) newValue); return;
			case JsonSchemaPackage.SCHEMA__UNIQUE_ITEMS: setUniqueItems((Boolean) newValue); return;
			case JsonSchemaPackage.SCHEMA__MIN_CONTAINS: setMinContains((Integer) newValue); return;
			case JsonSchemaPackage.SCHEMA__MAX_CONTAINS: setMaxContains((Integer) newValue); return;
			case JsonSchemaPackage.SCHEMA__REQUIRED: getRequired().clear(); getRequired().addAll((Collection<? extends String>) newValue); return;
			case JsonSchemaPackage.SCHEMA__MIN_PROPERTIES: setMinProperties((Integer) newValue); return;
			case JsonSchemaPackage.SCHEMA__MAX_PROPERTIES: setMaxProperties((Integer) newValue); return;
			case JsonSchemaPackage.SCHEMA__DEPENDENT_REQUIRED: getDependentRequired().clear(); getDependentRequired().addAll((Collection<? extends StringListEntry>) newValue); return;
			case JsonSchemaPackage.SCHEMA__ALL_OF: getAllOf().clear(); getAllOf().addAll((Collection<? extends Schema>) newValue); return;
			case JsonSchemaPackage.SCHEMA__ANY_OF: getAnyOf().clear(); getAnyOf().addAll((Collection<? extends Schema>) newValue); return;
			case JsonSchemaPackage.SCHEMA__ONE_OF: getOneOf().clear(); getOneOf().addAll((Collection<? extends Schema>) newValue); return;
			case JsonSchemaPackage.SCHEMA__NOT: setNot((Schema) newValue); return;
			case JsonSchemaPackage.SCHEMA__IF: setIf((Schema) newValue); return;
			case JsonSchemaPackage.SCHEMA__THEN: setThen((Schema) newValue); return;
			case JsonSchemaPackage.SCHEMA__ELSE: setElse((Schema) newValue); return;
			case JsonSchemaPackage.SCHEMA__PROPERTIES: getProperties().clear(); getProperties().addAll((Collection<? extends SchemaEntry>) newValue); return;
			case JsonSchemaPackage.SCHEMA__PATTERN_PROPERTIES: getPatternProperties().clear(); getPatternProperties().addAll((Collection<? extends SchemaEntry>) newValue); return;
			case JsonSchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES: setAdditionalProperties((Schema) newValue); return;
			case JsonSchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN: setAdditionalPropertiesBoolean((Boolean) newValue); return;
			case JsonSchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES: setUnevaluatedProperties((Schema) newValue); return;
			case JsonSchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN: setUnevaluatedPropertiesBoolean((Boolean) newValue); return;
			case JsonSchemaPackage.SCHEMA__DEPENDENT_SCHEMAS: getDependentSchemas().clear(); getDependentSchemas().addAll((Collection<? extends SchemaEntry>) newValue); return;
			case JsonSchemaPackage.SCHEMA__ITEMS: setItems((Schema) newValue); return;
			case JsonSchemaPackage.SCHEMA__ITEMS_BOOLEAN: setItemsBoolean((Boolean) newValue); return;
			case JsonSchemaPackage.SCHEMA__PREFIX_ITEMS: getPrefixItems().clear(); getPrefixItems().addAll((Collection<? extends Schema>) newValue); return;
			case JsonSchemaPackage.SCHEMA__CONTAINS: setContains((Schema) newValue); return;
			case JsonSchemaPackage.SCHEMA__UNEVALUATED_ITEMS: setUnevaluatedItems((Schema) newValue); return;
			case JsonSchemaPackage.SCHEMA__TITLE: setTitle((String) newValue); return;
			case JsonSchemaPackage.SCHEMA__DESCRIPTION: setDescription((String) newValue); return;
			case JsonSchemaPackage.SCHEMA__DEFAULT: setDefault((String) newValue); return;
			case JsonSchemaPackage.SCHEMA__DEPRECATED: setDeprecated((Boolean) newValue); return;
			case JsonSchemaPackage.SCHEMA__READ_ONLY: setReadOnly((Boolean) newValue); return;
			case JsonSchemaPackage.SCHEMA__WRITE_ONLY: setWriteOnly((Boolean) newValue); return;
			case JsonSchemaPackage.SCHEMA__EXAMPLES: getExamples().clear(); getExamples().addAll((Collection<? extends String>) newValue); return;
			case JsonSchemaPackage.SCHEMA__FORMAT: setFormat((String) newValue); return;
			case JsonSchemaPackage.SCHEMA__CONTENT_ENCODING: setContentEncoding((String) newValue); return;
			case JsonSchemaPackage.SCHEMA__CONTENT_MEDIA_TYPE: setContentMediaType((String) newValue); return;
			case JsonSchemaPackage.SCHEMA__CONTENT_SCHEMA: setContentSchema((Schema) newValue); return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JsonSchemaPackage.SCHEMA__SCHEMA_VERSION: setSchemaVersion(null); return;
			case JsonSchemaPackage.SCHEMA__ID: setId(null); return;
			case JsonSchemaPackage.SCHEMA__ANCHOR: setAnchor(null); return;
			case JsonSchemaPackage.SCHEMA__DYNAMIC_ANCHOR: setDynamicAnchor(null); return;
			case JsonSchemaPackage.SCHEMA__REF: setRef(null); return;
			case JsonSchemaPackage.SCHEMA__DYNAMIC_REF: setDynamicRef(null); return;
			case JsonSchemaPackage.SCHEMA__COMMENT: setComment(null); return;
			case JsonSchemaPackage.SCHEMA__DEFS: getDefs().clear(); return;
			case JsonSchemaPackage.SCHEMA__BOOLEAN_VALUE: setBooleanValue(null); return;
			case JsonSchemaPackage.SCHEMA__TYPES: getTypes().clear(); return;
			case JsonSchemaPackage.SCHEMA__CONST: setConst(null); return;
			case JsonSchemaPackage.SCHEMA__ENUM: getEnum().clear(); return;
			case JsonSchemaPackage.SCHEMA__MINIMUM: setMinimum(null); return;
			case JsonSchemaPackage.SCHEMA__MAXIMUM: setMaximum(null); return;
			case JsonSchemaPackage.SCHEMA__EXCLUSIVE_MINIMUM: setExclusiveMinimum(null); return;
			case JsonSchemaPackage.SCHEMA__EXCLUSIVE_MAXIMUM: setExclusiveMaximum(null); return;
			case JsonSchemaPackage.SCHEMA__MULTIPLE_OF: setMultipleOf(null); return;
			case JsonSchemaPackage.SCHEMA__MIN_LENGTH: setMinLength(null); return;
			case JsonSchemaPackage.SCHEMA__MAX_LENGTH: setMaxLength(null); return;
			case JsonSchemaPackage.SCHEMA__PATTERN: setPattern(null); return;
			case JsonSchemaPackage.SCHEMA__MIN_ITEMS: setMinItems(null); return;
			case JsonSchemaPackage.SCHEMA__MAX_ITEMS: setMaxItems(null); return;
			case JsonSchemaPackage.SCHEMA__UNIQUE_ITEMS: setUniqueItems(null); return;
			case JsonSchemaPackage.SCHEMA__MIN_CONTAINS: setMinContains(null); return;
			case JsonSchemaPackage.SCHEMA__MAX_CONTAINS: setMaxContains(null); return;
			case JsonSchemaPackage.SCHEMA__REQUIRED: getRequired().clear(); return;
			case JsonSchemaPackage.SCHEMA__MIN_PROPERTIES: setMinProperties(null); return;
			case JsonSchemaPackage.SCHEMA__MAX_PROPERTIES: setMaxProperties(null); return;
			case JsonSchemaPackage.SCHEMA__DEPENDENT_REQUIRED: getDependentRequired().clear(); return;
			case JsonSchemaPackage.SCHEMA__ALL_OF: getAllOf().clear(); return;
			case JsonSchemaPackage.SCHEMA__ANY_OF: getAnyOf().clear(); return;
			case JsonSchemaPackage.SCHEMA__ONE_OF: getOneOf().clear(); return;
			case JsonSchemaPackage.SCHEMA__NOT: setNot(null); return;
			case JsonSchemaPackage.SCHEMA__IF: setIf(null); return;
			case JsonSchemaPackage.SCHEMA__THEN: setThen(null); return;
			case JsonSchemaPackage.SCHEMA__ELSE: setElse(null); return;
			case JsonSchemaPackage.SCHEMA__PROPERTIES: getProperties().clear(); return;
			case JsonSchemaPackage.SCHEMA__PATTERN_PROPERTIES: getPatternProperties().clear(); return;
			case JsonSchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES: setAdditionalProperties(null); return;
			case JsonSchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN: setAdditionalPropertiesBoolean(null); return;
			case JsonSchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES: setUnevaluatedProperties(null); return;
			case JsonSchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN: setUnevaluatedPropertiesBoolean(null); return;
			case JsonSchemaPackage.SCHEMA__DEPENDENT_SCHEMAS: getDependentSchemas().clear(); return;
			case JsonSchemaPackage.SCHEMA__ITEMS: setItems(null); return;
			case JsonSchemaPackage.SCHEMA__ITEMS_BOOLEAN: setItemsBoolean(null); return;
			case JsonSchemaPackage.SCHEMA__PREFIX_ITEMS: getPrefixItems().clear(); return;
			case JsonSchemaPackage.SCHEMA__CONTAINS: setContains(null); return;
			case JsonSchemaPackage.SCHEMA__UNEVALUATED_ITEMS: setUnevaluatedItems(null); return;
			case JsonSchemaPackage.SCHEMA__TITLE: setTitle(null); return;
			case JsonSchemaPackage.SCHEMA__DESCRIPTION: setDescription(null); return;
			case JsonSchemaPackage.SCHEMA__DEFAULT: setDefault(null); return;
			case JsonSchemaPackage.SCHEMA__DEPRECATED: setDeprecated(null); return;
			case JsonSchemaPackage.SCHEMA__READ_ONLY: setReadOnly(null); return;
			case JsonSchemaPackage.SCHEMA__WRITE_ONLY: setWriteOnly(null); return;
			case JsonSchemaPackage.SCHEMA__EXAMPLES: getExamples().clear(); return;
			case JsonSchemaPackage.SCHEMA__FORMAT: setFormat(null); return;
			case JsonSchemaPackage.SCHEMA__CONTENT_ENCODING: setContentEncoding(null); return;
			case JsonSchemaPackage.SCHEMA__CONTENT_MEDIA_TYPE: setContentMediaType(null); return;
			case JsonSchemaPackage.SCHEMA__CONTENT_SCHEMA: setContentSchema(null); return;
		}
		super.eUnset(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JsonSchemaPackage.SCHEMA__SCHEMA_VERSION: return getSchemaVersion() != null;
			case JsonSchemaPackage.SCHEMA__ID: return getId() != null;
			case JsonSchemaPackage.SCHEMA__ANCHOR: return getAnchor() != null;
			case JsonSchemaPackage.SCHEMA__DYNAMIC_ANCHOR: return getDynamicAnchor() != null;
			case JsonSchemaPackage.SCHEMA__REF: return getRef() != null;
			case JsonSchemaPackage.SCHEMA__DYNAMIC_REF: return getDynamicRef() != null;
			case JsonSchemaPackage.SCHEMA__COMMENT: return getComment() != null;
			case JsonSchemaPackage.SCHEMA__DEFS: return !getDefs().isEmpty();
			case JsonSchemaPackage.SCHEMA__BOOLEAN_VALUE: return getBooleanValue() != null;
			case JsonSchemaPackage.SCHEMA__TYPES: return !getTypes().isEmpty();
			case JsonSchemaPackage.SCHEMA__CONST: return getConst() != null;
			case JsonSchemaPackage.SCHEMA__ENUM: return !getEnum().isEmpty();
			case JsonSchemaPackage.SCHEMA__MINIMUM: return getMinimum() != null;
			case JsonSchemaPackage.SCHEMA__MAXIMUM: return getMaximum() != null;
			case JsonSchemaPackage.SCHEMA__EXCLUSIVE_MINIMUM: return getExclusiveMinimum() != null;
			case JsonSchemaPackage.SCHEMA__EXCLUSIVE_MAXIMUM: return getExclusiveMaximum() != null;
			case JsonSchemaPackage.SCHEMA__MULTIPLE_OF: return getMultipleOf() != null;
			case JsonSchemaPackage.SCHEMA__MIN_LENGTH: return getMinLength() != null;
			case JsonSchemaPackage.SCHEMA__MAX_LENGTH: return getMaxLength() != null;
			case JsonSchemaPackage.SCHEMA__PATTERN: return getPattern() != null;
			case JsonSchemaPackage.SCHEMA__MIN_ITEMS: return getMinItems() != null;
			case JsonSchemaPackage.SCHEMA__MAX_ITEMS: return getMaxItems() != null;
			case JsonSchemaPackage.SCHEMA__UNIQUE_ITEMS: return getUniqueItems() != null;
			case JsonSchemaPackage.SCHEMA__MIN_CONTAINS: return getMinContains() != null;
			case JsonSchemaPackage.SCHEMA__MAX_CONTAINS: return getMaxContains() != null;
			case JsonSchemaPackage.SCHEMA__REQUIRED: return !getRequired().isEmpty();
			case JsonSchemaPackage.SCHEMA__MIN_PROPERTIES: return getMinProperties() != null;
			case JsonSchemaPackage.SCHEMA__MAX_PROPERTIES: return getMaxProperties() != null;
			case JsonSchemaPackage.SCHEMA__DEPENDENT_REQUIRED: return !getDependentRequired().isEmpty();
			case JsonSchemaPackage.SCHEMA__ALL_OF: return !getAllOf().isEmpty();
			case JsonSchemaPackage.SCHEMA__ANY_OF: return !getAnyOf().isEmpty();
			case JsonSchemaPackage.SCHEMA__ONE_OF: return !getOneOf().isEmpty();
			case JsonSchemaPackage.SCHEMA__NOT: return getNot() != null;
			case JsonSchemaPackage.SCHEMA__IF: return getIf() != null;
			case JsonSchemaPackage.SCHEMA__THEN: return getThen() != null;
			case JsonSchemaPackage.SCHEMA__ELSE: return getElse() != null;
			case JsonSchemaPackage.SCHEMA__PROPERTIES: return !getProperties().isEmpty();
			case JsonSchemaPackage.SCHEMA__PATTERN_PROPERTIES: return !getPatternProperties().isEmpty();
			case JsonSchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES: return getAdditionalProperties() != null;
			case JsonSchemaPackage.SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN: return getAdditionalPropertiesBoolean() != null;
			case JsonSchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES: return getUnevaluatedProperties() != null;
			case JsonSchemaPackage.SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN: return getUnevaluatedPropertiesBoolean() != null;
			case JsonSchemaPackage.SCHEMA__DEPENDENT_SCHEMAS: return !getDependentSchemas().isEmpty();
			case JsonSchemaPackage.SCHEMA__ITEMS: return getItems() != null;
			case JsonSchemaPackage.SCHEMA__ITEMS_BOOLEAN: return getItemsBoolean() != null;
			case JsonSchemaPackage.SCHEMA__PREFIX_ITEMS: return !getPrefixItems().isEmpty();
			case JsonSchemaPackage.SCHEMA__CONTAINS: return getContains() != null;
			case JsonSchemaPackage.SCHEMA__UNEVALUATED_ITEMS: return getUnevaluatedItems() != null;
			case JsonSchemaPackage.SCHEMA__TITLE: return getTitle() != null;
			case JsonSchemaPackage.SCHEMA__DESCRIPTION: return getDescription() != null;
			case JsonSchemaPackage.SCHEMA__DEFAULT: return getDefault() != null;
			case JsonSchemaPackage.SCHEMA__DEPRECATED: return getDeprecated() != null;
			case JsonSchemaPackage.SCHEMA__READ_ONLY: return getReadOnly() != null;
			case JsonSchemaPackage.SCHEMA__WRITE_ONLY: return getWriteOnly() != null;
			case JsonSchemaPackage.SCHEMA__EXAMPLES: return !getExamples().isEmpty();
			case JsonSchemaPackage.SCHEMA__FORMAT: return getFormat() != null;
			case JsonSchemaPackage.SCHEMA__CONTENT_ENCODING: return getContentEncoding() != null;
			case JsonSchemaPackage.SCHEMA__CONTENT_MEDIA_TYPE: return getContentMediaType() != null;
			case JsonSchemaPackage.SCHEMA__CONTENT_SCHEMA: return getContentSchema() != null;
		}
		return super.eIsSet(featureID);
	}

} //SchemaImpl
