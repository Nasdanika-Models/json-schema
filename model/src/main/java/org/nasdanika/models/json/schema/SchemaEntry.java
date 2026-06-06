/**
 */
package org.nasdanika.models.json.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A map entry mapping a string key to a Schema. Used for properties, patternProperties, dependentSchemas, and $defs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.json.schema.SchemaEntry#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.models.json.schema.SchemaEntry#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchemaEntry()
 * @model
 * @generated
 */
public interface SchemaEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The key (property name, pattern, or definition name).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchemaEntry_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.SchemaEntry#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The schema value associated with the key.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Schema)
	 * @see org.nasdanika.models.json.schema.SchemaPackage#getSchemaEntry_Value()
	 * @model containment="true"
	 * @generated
	 */
	Schema getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.json.schema.SchemaEntry#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Schema value);

} // SchemaEntry
