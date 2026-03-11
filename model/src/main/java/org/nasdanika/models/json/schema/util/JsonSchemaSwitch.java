package org.nasdanika.models.json.schema.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.json.schema.*;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model.
 * @see org.nasdanika.models.json.schema.JsonSchemaPackage
 * @generated
 */
public class JsonSchemaSwitch<T> extends Switch<T> {

	protected static JsonSchemaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public JsonSchemaSwitch() {
		if (modelPackage == null) {
			modelPackage = JsonSchemaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non-null result.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JsonSchemaPackage.SCHEMA: {
				Schema schema = (Schema) theEObject;
				T result = caseSchema(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JsonSchemaPackage.SCHEMA_ENTRY: {
				SchemaEntry schemaEntry = (SchemaEntry) theEObject;
				T result = caseSchemaEntry(schemaEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JsonSchemaPackage.STRING_LIST_ENTRY: {
				StringListEntry stringListEntry = (StringListEntry) theEObject;
				T result = caseStringListEntry(stringListEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of Schema.
	 * @generated
	 */
	public T caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of SchemaEntry.
	 * @generated
	 */
	public T caseSchemaEntry(SchemaEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of StringListEntry.
	 * @generated
	 */
	public T caseStringListEntry(StringListEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of EObject.
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JsonSchemaSwitch
