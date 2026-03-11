package org.nasdanika.models.json.schema.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.json.schema.*;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @see org.nasdanika.models.json.schema.JsonSchemaPackage
 * @generated
 */
public class JsonSchemaAdapterFactory extends AdapterFactoryImpl {

	protected static JsonSchemaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public JsonSchemaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JsonSchemaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * @generated
	 */
	protected JsonSchemaSwitch<Adapter> modelSwitch = new JsonSchemaSwitch<Adapter>() {
		@Override
		public Adapter caseSchema(Schema object) {
			return createSchemaAdapter();
		}
		@Override
		public Adapter caseSchemaEntry(SchemaEntry object) {
			return createSchemaEntryAdapter();
		}
		@Override
		public Adapter caseStringListEntry(StringListEntry object) {
			return createStringListEntryAdapter();
		}
		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class Schema.
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class SchemaEntry.
	 * @generated
	 */
	public Adapter createSchemaEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class StringListEntry.
	 * @generated
	 */
	public Adapter createStringListEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JsonSchemaAdapterFactory
