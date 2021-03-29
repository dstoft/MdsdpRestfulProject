/*
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import sdu.mdsd.restful.RestControllerGenerationRuntimeModule;
import sdu.mdsd.restful.RestControllerGenerationStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class RestControllerGenerationIdeSetup extends RestControllerGenerationStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new RestControllerGenerationRuntimeModule(), new RestControllerGenerationIdeModule()));
	}
	
}
