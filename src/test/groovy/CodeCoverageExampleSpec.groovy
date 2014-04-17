import spock.lang.Specification

class CodeCoverageExampleSpec extends Specification {
	def "calls usedMethod"() {
		setup:
		CodeCoverageExample cce = new CodeCoverageExample()

		expect:
		result == cce.usedMethod(givenValue)

		where:

		result | givenValue
		1      | true
		2      | false
	}
}