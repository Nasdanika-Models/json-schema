package org.nasdanika.models.json.schema;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 *
 * @see org.nasdanika.models.json.schema.JsonSchemaPackage
 * @generated
 */
public interface JsonSchemaFactory extends EFactory {

	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	JsonSchemaFactory eINSTANCE = org.nasdanika.models.json.schema.impl.JsonSchemaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Schema</em>'.
	 * @return a new object of class '<em>Schema</em>'.
	 * @generated
	 */
	Schema createSchema();

	/**
	 * Returns a new object of class '<em>Schema Entry</em>'.
	 * @return a new object of class '<em>Schema Entry</em>'.
	 * @generated
	 */
	SchemaEntry createSchemaEntry();

	/**
	 * Returns a new object of class '<em>String List Entry</em>'.
	 * @return a new object of class '<em>String List Entry</em>'.
	 * @generated
	 */
	StringListEntry createStringListEntry();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	JsonSchemaPackage getJsonSchemaPackage();

} //JsonSchemaFactory
