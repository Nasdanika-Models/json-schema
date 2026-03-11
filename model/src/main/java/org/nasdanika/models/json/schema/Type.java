package org.nasdanika.models.json.schema;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * A representation of the literals of the enumeration '<em><b>Type</b></em>',
 * and utility methods for working with them.
 * JSON Schema primitive types.
 * @generated
 */
public enum Type implements Enumerator {
	/**
	 * The '<em><b>object</b></em>' literal object.
	 * JSON object type.
	 * @generated
	 */
	OBJECT(0, "object", "object"),
	/**
	 * The '<em><b>array</b></em>' literal object.
	 * JSON array type.
	 * @generated
	 */
	ARRAY(1, "array", "array"),
	/**
	 * The '<em><b>string</b></em>' literal object.
	 * JSON string type.
	 * @generated
	 */
	STRING(2, "string", "string"),
	/**
	 * The '<em><b>number</b></em>' literal object.
	 * JSON number type.
	 * @generated
	 */
	NUMBER(3, "number", "number"),
	/**
	 * The '<em><b>integer</b></em>' literal object.
	 * JSON integer type.
	 * @generated
	 */
	INTEGER(4, "integer", "integer"),
	/**
	 * The '<em><b>boolean</b></em>' literal object.
	 * JSON boolean type.
	 * @generated
	 */
	BOOLEAN(5, "boolean", "boolean"),
	/**
	 * The '<em><b>null</b></em>' literal object.
	 * JSON null type.
	 * @generated
	 */
	NULL(6, "null", "null");

	/**
	 * The '<em><b>object</b></em>' literal value.
	 * @generated
	 */
	public static final int OBJECT_VALUE = 0;

	/**
	 * The '<em><b>array</b></em>' literal value.
	 * @generated
	 */
	public static final int ARRAY_VALUE = 1;

	/**
	 * The '<em><b>string</b></em>' literal value.
	 * @generated
	 */
	public static final int STRING_VALUE = 2;

	/**
	 * The '<em><b>number</b></em>' literal value.
	 * @generated
	 */
	public static final int NUMBER_VALUE = 3;

	/**
	 * The '<em><b>integer</b></em>' literal value.
	 * @generated
	 */
	public static final int INTEGER_VALUE = 4;

	/**
	 * The '<em><b>boolean</b></em>' literal value.
	 * @generated
	 */
	public static final int BOOLEAN_VALUE = 5;

	/**
	 * The '<em><b>null</b></em>' literal value.
	 * @generated
	 */
	public static final int NULL_VALUE = 6;

	/**
	 * An array of all the '<em><b>Type</b></em>' enumerators.
	 * @generated
	 */
	private static final Type[] VALUES_ARRAY = new Type[] {
		OBJECT,
		ARRAY,
		STRING,
		NUMBER,
		INTEGER,
		BOOLEAN,
		NULL,
	};

	/**
	 * A public read-only list of all the '<em><b>Type</b></em>' enumerators.
	 * @generated
	 */
	public static final List<Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified literal value.
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified name.
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified integer value.
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type get(int value) {
		switch (value) {
			case OBJECT_VALUE: return OBJECT;
			case ARRAY_VALUE: return ARRAY;
			case STRING_VALUE: return STRING;
			case NUMBER_VALUE: return NUMBER;
			case INTEGER_VALUE: return INTEGER;
			case BOOLEAN_VALUE: return BOOLEAN;
			case NULL_VALUE: return NULL;
		}
		return null;
	}

	private final int value;
	private final String name;
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * @generated
	 */
	private Type(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Type
