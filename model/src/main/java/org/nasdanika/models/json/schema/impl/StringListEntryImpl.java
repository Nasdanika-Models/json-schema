package org.nasdanika.models.json.schema.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.json.schema.JsonSchemaPackage;
import org.nasdanika.models.json.schema.StringListEntry;

/**
 * An implementation of the model object '<em><b>String List Entry</b></em>'.
 * @generated
 */
public class StringListEntryImpl extends MinimalEObjectImpl.Container implements StringListEntry {

	/**
	 * @generated
	 */
	protected StringListEntryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonSchemaPackage.Literals.STRING_LIST_ENTRY;
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
		return (String) eDynamicGet(JsonSchemaPackage.STRING_LIST_ENTRY__KEY, JsonSchemaPackage.Literals.STRING_LIST_ENTRY__KEY, true, true);
	}

	@Override
	public void setKey(String newKey) {
		eDynamicSet(JsonSchemaPackage.STRING_LIST_ENTRY__KEY, JsonSchemaPackage.Literals.STRING_LIST_ENTRY__KEY, newKey);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getValues() {
		return (EList<String>) eDynamicGet(JsonSchemaPackage.STRING_LIST_ENTRY__VALUES, JsonSchemaPackage.Literals.STRING_LIST_ENTRY__VALUES, true, true);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JsonSchemaPackage.STRING_LIST_ENTRY__KEY: return getKey();
			case JsonSchemaPackage.STRING_LIST_ENTRY__VALUES: return getValues();
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
			case JsonSchemaPackage.STRING_LIST_ENTRY__KEY: setKey((String) newValue); return;
			case JsonSchemaPackage.STRING_LIST_ENTRY__VALUES: getValues().clear(); getValues().addAll((Collection<? extends String>) newValue); return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JsonSchemaPackage.STRING_LIST_ENTRY__KEY: setKey(null); return;
			case JsonSchemaPackage.STRING_LIST_ENTRY__VALUES: getValues().clear(); return;
		}
		super.eUnset(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JsonSchemaPackage.STRING_LIST_ENTRY__KEY: return getKey() != null;
			case JsonSchemaPackage.STRING_LIST_ENTRY__VALUES: return !getValues().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StringListEntryImpl
