import groovy.transform.CompileStatic

@CompileStatic
class CodeCoverageExample {
	def usedMethod(def a) {
		if (a) {
			dispatchToPrivateMethod()
		} else {
			dispatchToPrivateMethod2()
		}
	}

	def unusedMethod(def a) {
		if (a) {
			dispatchToPrivateMethod()
		}
	}

	private def dispatchToPrivateMethod() {
		1
	}

	private def dispatchToPrivateMethod2() {
		2
	}

}