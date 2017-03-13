package com.ff

import hudson.model.*

def config = new HashMap()
def bindings = getBinding()
config.putAll(bindings.getVariables())

def out = config['out']

class SayHello {
	def sayHello(String name){
		out.println (" Hello ***************** " + name )
	}

	def anotherMethod(String name){
		return "------  called anotherMethod with argument as " + name
	}
}