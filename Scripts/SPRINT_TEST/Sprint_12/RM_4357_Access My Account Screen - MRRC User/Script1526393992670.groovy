import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ApplicationURL)

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.mrrc2user20)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Tab_a_My Account'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('USER_Management/MyAccount/button_Back To  Plan Portal'), 0)

WebUI.verifyElementPresent(findTestObject('USER_Management/MyAccount/h1_My Account'), 0)

WebUI.verifyElementPresent(findTestObject('USER_Management/MyAccount/h2_Contact Information'), 0)

WebUI.verifyElementPresent(findTestObject('USER_Management/MyAccount/h2_Security Information'), 0)

WebUI.verifyElementPresent(findTestObject('USER_Management/MyAccount/h2_Update Password'), 0)

WebUI.verifyElementPresent(findTestObject('USER_Management/MyAccount/h2_Update Multi-Factor Authent'), 0)

WebUI.verifyElementPresent(findTestObject('USER_Management/MyAccount/li_Username'), 0)

WebUI.verifyElementPresent(findTestObject('USER_Management/MyAccount/li_Name'), 0)

WebUI.verifyElementPresent(findTestObject('USER_Management/MyAccount/li_MAO MRRC'), 0)

