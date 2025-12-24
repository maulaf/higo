import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class TestListener {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		WebUI.openBrowser(GlobalVariable.URL)
		WebUI.maximizeWindow()
		
		//verify header
		def aboutUs = "/about-us"
		def stucyCase = "/case-study"
		def blog = "https://blog.higo.id/"
		def digitalReports = "/digital-reports"
		def contactUs = "/contact-us"
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/navigation', [('href') : aboutUs]))
		WebUI.verifyElementVisible(findTestObject('Object Repository/navigation', [('href') : stucyCase]))
		WebUI.verifyElementVisible(findTestObject('Object Repository/navigation', [('href') : blog]))
		WebUI.verifyElementVisible(findTestObject('Object Repository/navigation', [('href') : digitalReports]))
		WebUI.verifyElementVisible(findTestObject('Object Repository/navigation', [('href') : contactUs]))
		
		
		//verify footer
		def linkedin = "https://www.linkedin.com/company/pt-higo-fitur-indonesia"
		def facebook = "https://www.facebook.com/HIGOSPOTINDONESIA"
		def instagram = "https://www.instagram.com/higo.id"
		def twitter = "https://x.com/HIGO_spot"
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/href', [('href') : linkedin]))
		WebUI.verifyElementVisible(findTestObject('Object Repository/href', [('href') : facebook]))
		WebUI.verifyElementVisible(findTestObject('Object Repository/href', [('href') : instagram]))
		WebUI.verifyElementVisible(findTestObject('Object Repository/href', [('href') : twitter]))
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase(TestCaseContext testCaseContext) {
	
	}
}