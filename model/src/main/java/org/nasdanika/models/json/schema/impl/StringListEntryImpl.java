/**
 */
package org.nasdanika.models.json.schema.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.json.schema.SchemaPackage;
import org.nasdanika.models.json.schema.StringListEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String List Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.json.schema.impl.StringListEntryImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.impl.StringListEntryImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringListEntryImpl extends MinimalEObjectImpl.Container implements StringListEntry {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringListEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.Literals.STRING_LIST_ENTRY;
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
	public String getKey() {
		return (String)eDynamicGet(SchemaPackage.STRING_LIST_ENTRY__KEY, SchemaPackage.Literals.STRING_LIST_ENTRY__KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String newKey) {
		eDynamicSet(SchemaPackage.STRING_LIST_ENTRY__KEY, SchemaPackage.Literals.STRING_LIST_ENTRY__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getValues() {
		return (EList<String>)eDynamicGet(SchemaPackage.STRING_LIST_ENTRY__VALUES, SchemaPackage.Literals.STRING_LIST_ENTRY__VALUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.STRING_LIST_ENTRY__KEY:
				return getKey();
			case SchemaPackage.STRING_LIST_ENTRY__VALUES:
				return getValues();
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
			case SchemaPackage.STRING_LIST_ENTRY__KEY:
				setKey((String)newValue);
				return;
			case SchemaPackage.STRING_LIST_ENTRY__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends String>)newValue);
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
			case SchemaPackage.STRING_LIST_ENTRY__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case SchemaPackage.STRING_LIST_ENTRY__VALUES:
				getValues().clear();
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
			case SchemaPackage.STRING_LIST_ENTRY__KEY:
				return KEY_EDEFAULT == null ? getKey() != null : !KEY_EDEFAULT.equals(getKey());
			case SchemaPackage.STRING_LIST_ENTRY__VALUES:
				return !getValues().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StringListEntryImpl
