package br.com.gepro.common;

import java.util.UUID;

public class IntegrityCommon {

	public static String primaryKey() {
		return UUID.randomUUID().toString();
	}
	
}
