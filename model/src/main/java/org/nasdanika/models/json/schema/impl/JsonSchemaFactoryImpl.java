package org.nasdanika.models.json.schema.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.json.schema.JsonSchemaFactory;
import org.nasdanika.models.json.schema.JsonSchemaPackage;
import org.nasdanika.models.json.schema.Schema;
import org.nasdanika.models.json.schema.SchemaEntry;
import org.nasdanika.models.json.schema.StringListEntry;
import org.nasdanika.models.json.schema.Type;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class JsonSchemaFactoryImpl extends EFactoryImpl implements JsonSchemaFactory {

	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static JsonSchemaFactory init() {
		try {
			JsonSchemaFactory theFactory = (JsonSchemaFactory) EPackage.Registry.INSTANCE
					.getEFactory(JsonSchemaPackage.eNS_URI);
			if (theFactory != null) {
				return theFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JsonSchemaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public JsonSchemaFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JsonSchemaPackage.SCHEMA: return createSchema();
			case JsonSchemaPackage.SCHEMA_ENTRY: return createSchemaEntry();
			case JsonSchemaPackage.STRING_LIST_ENTRY: return createStringListEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JsonSchemaPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JsonSchemaPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	@Override
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * @generated
	 */
	@Override
	public SchemaEntry createSchemaEntry() {
		SchemaEntryImpl schemaEntry = new SchemaEntryImpl();
		return schemaEntry;
	}

	/**
	 * @generated
	 */
	@Override
	public StringListEntry createStringListEntry() {
		StringListEntryImpl stringListEntry = new StringListEntryImpl();
		return stringListEntry;
	}

	/**
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * @generated
	 */
	@Override
	public JsonSchemaPackage getJsonSchemaPackage() {
		return (JsonSchemaPackage) getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JsonSchemaPackage getPackage() {
		return JsonSchemaPackage.eINSTANCE;
	}

} //JsonSchemaFactoryImpl
