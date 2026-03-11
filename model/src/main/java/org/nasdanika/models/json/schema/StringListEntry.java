package org.nasdanika.models.json.schema;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>String List Entry</b></em>'.
 * A map entry mapping a string key to a list of strings. Used for dependentRequired.
 *
 * @see org.nasdanika.models.json.schema.JsonSchemaPackage#getStringListEntryClass()
 * @generated
 */
public interface StringListEntry extends EObject {

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The property name.
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.nasdanika.models.json.schema.JsonSchemaPackage#getStringListEntry_Key()
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.StringListEntry#getKey <em>Key</em>}' attribute.
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list of required property names that depend on the key property.
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see org.nasdanika.models.json.schema.JsonSchemaPackage#getStringListEntry_Values()
	 * @generated
	 */
	EList<String> getValues();

} //StringListEntry
