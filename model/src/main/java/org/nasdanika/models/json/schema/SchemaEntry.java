package org.nasdanika.models.json.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Schema Entry</b></em>'.
 * A map entry mapping a string key to a Schema. Used for properties, patternProperties, dependentSchemas, and $defs.
 *
 * @see org.nasdanika.models.json.schema.JsonSchemaPackage#getSchemaEntryClass()
 * @generated
 */
public interface SchemaEntry extends EObject {

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The key (property name, pattern, or definition name).
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.nasdanika.models.json.schema.JsonSchemaPackage#getSchemaEntry_Key()
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.SchemaEntry#getKey <em>Key</em>}' attribute.
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * The schema value associated with the key.
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Schema)
	 * @see org.nasdanika.models.json.schema.JsonSchemaPackage#getSchemaEntry_Value()
	 * @generated
	 */
	Schema getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.SchemaEntry#getValue <em>Value</em>}' containment reference.
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Schema value);

} //SchemaEntry
