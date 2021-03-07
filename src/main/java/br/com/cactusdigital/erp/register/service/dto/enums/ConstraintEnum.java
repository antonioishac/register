package br.com.cactusdigital.erp.register.service.dto.enums;

public enum ConstraintEnum {

	UNDEFINED("UNDEFINED"),
	UK_CLIENT_EMAIL( Constraint.UK_CLIENT_EMAIL),
	;

	private String name;

	private ConstraintEnum(String name ) {
		this.name = name;
	}

	public static ConstraintEnum getConstraint( String messageError ) {
		for ( ConstraintEnum v : ConstraintEnum.values() ) {
			if( messageError.contains( v.getName() )) {
				return v;
			}
		}
		return UNDEFINED;
	}

	public String getName() {
		return name;
	}
}
