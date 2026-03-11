package org.nasdanika.models.json.schema.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.json.schema.JsonSchemaPackage;
import org.nasdanika.models.json.schema.Schema;
import org.nasdanika.models.json.schema.SchemaEntry;

/**
 * An implementation of the model object '<em><b>Schema Entry</b></em>'.
 * @generated
 */
public class SchemaEntryImpl extends MinimalEObjectImpl.Container implements SchemaEntry {

	/**
	 * @generated
	 */
	protected SchemaEntryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonSchemaPackage.Literals.SCHEMA_ENTRY;
	}

	/**
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	@Override
	public String getKey() {
		return (String) eDynamicGet(JsonSchemaPackage.SCHEMA_ENTRY__KEY, JsonSchemaPackage.Literals.SCHEMA_ENTRY__KEY, true, true);
	}

	@Override
	public void setKey(String newKey) {
		eDynamicSet(JsonSchemaPackage.SCHEMA_ENTRY__KEY, JsonSchemaPackage.Literals.SCHEMA_ENTRY__KEY, newKey);
	}

	@Override
	public Schema getValue() {
		return (Schema) eDynamicGet(JsonSchemaPackage.SCHEMA_ENTRY__VALUE, JsonSchemaPackage.Literals.SCHEMA_ENTRY__VALUE, true, true);
	}

	@Override
	public void setValue(Schema newValue) {
		eDynamicSet(JsonSchemaPackage.SCHEMA_ENTRY__VALUE, JsonSchemaPackage.Literals.SCHEMA_ENTRY__VALUE, newValue);
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JsonSchemaPackage.SCHEMA_ENTRY__VALUE:
				return eDynamicInverseRemove(otherEnd, EOPPOSITE_FEATURE_BASE - JsonSchemaPackage.SCHEMA_ENTRY__VALUE, null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JsonSchemaPackage.SCHEMA_ENTRY__KEY: return getKey();
			case JsonSchemaPackage.SCHEMA_ENTRY__VALUE: return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JsonSchemaPackage.SCHEMA_ENTRY__KEY: setKey((String) newValue); return;
			case JsonSchemaPackage.SCHEMA_ENTRY__VALUE: setValue((Schema) newValue); return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JsonSchemaPackage.SCHEMA_ENTRY__KEY: setKey(null); return;
			case JsonSchemaPackage.SCHEMA_ENTRY__VALUE: setValue(null); return;
		}
		super.eUnset(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JsonSchemaPackage.SCHEMA_ENTRY__KEY: return getKey() != null;
			case JsonSchemaPackage.SCHEMA_ENTRY__VALUE: return getValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //SchemaEntryImpl
