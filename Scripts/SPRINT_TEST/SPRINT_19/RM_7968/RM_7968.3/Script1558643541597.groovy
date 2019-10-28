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

WebUI.openBrowser(GlobalVariable.ApplicationURL + '/register')

WebUI.waitForPageLoad(2)

WebUI.maximizeWindow()

'7968.1'
WebUI.delay(3)

WebUI.setText(findTestObject('AccountRegister/Register/input_First Name_firstName'), 'bereket')

WebUI.setText(findTestObject('AccountRegister/Register/input_Last Name_lastName'), 'araia40')

WebUI.setText(findTestObject('AccountRegister/Register/input_Email Address_email'), 'bereket.araia@newwave.io')

WebUI.delay(3)

WebUI.click(findTestObject('AccountRegister/AccountRegistration/button_Next'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('AccountRegister/AccountRegistration/input_Contact Phone Number_phonePrimary'), 
    0)

WebUI.verifyElementPresent(findTestObject('AccountRegister/AccountRegistration/input_Contact Phone Extension_phoneSecondary'), 
    0)

WebUI.verifyElementPresent(findTestObject('AccountRegister/AccountRegistration/div_Organization Name'), 0)

WebUI.verifyElementPresent(findTestObject('AccountRegister/AccountRegistration/select_Select one of the following options'), 
    0)

WebUI.verifyElementPresent(findTestObject('AccountRegister/AccountRegistration/input_Answer Security Question_securityAnswer1'), 
    0)

WebUI.verifyElementPresent(findTestObject('AccountRegister/AccountRegistration/input_Confirm Answer Security Question'), 
    0)

