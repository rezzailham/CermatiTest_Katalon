package steps
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class RegisterUsers {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user access page {string}")
	def openRegisterPage(String url) {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(url)
	}

	@When("user input (.*) as mobilePhone")
	def inputMobilePhone(String mobilePhone) {
		WebUI.setText(findTestObject('Object Repository/Page_Daftar/inputMobilePhone'), mobilePhone)
	}

	@When("user input (.*) as email")
	def inputEmail(String email) {
		WebUI.setText(findTestObject('Object Repository/Page_Daftar/inputEmail'), email)
	}

	@When("user input (.*) as firstName")
	def inputFirstName(String firstName) {
		WebUI.setText(findTestObject('Object Repository/Page_Daftar/inputFirstName'), firstName)
	}

	@When("user input(.*) as lastName")
	def inputLastName(String lastName) {
		WebUI.setText(findTestObject('Object Repository/Page_Daftar/inputLastName'), lastName)
	}

	@When("user click on Daftar button")
	def clickDaftarButton() {
		WebUI.click(findTestObject('Object Repository/Page_Daftar/buttonDaftar'))
	}

	@Then("system display OTP Page")
	def verifyOTPPage() {
		//		WebUI.waitForElementVisible(findTestObject(), 10, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_VerifyPhoneNumber/h1_VerifyHp'), 15, FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()
	}
}