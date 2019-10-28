import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.ApplicationURL)

//WebUI.navigateToUrl(GlobalVariable.ApplicationURL)
WebUI.waitForPageLoad(2)

WebUI.maximizeWindow()

WebUI.delay(4)

WebUI.verifyElementText(findTestObject('USER_Management/P0_Login_Page_Global/Text_p_We use two-factor authentica'), 'We use Multi-Factor Authentication to protect your account. You can set up your Multi-Factor Authentication by selecting any of the following methods: Voice Authentication, Google Authenticator, or SMS Authentication. Depending on the selected method, this will include a passcode entry that will be received via a phone call, opening the Google Authenticator app, or via text message.')

