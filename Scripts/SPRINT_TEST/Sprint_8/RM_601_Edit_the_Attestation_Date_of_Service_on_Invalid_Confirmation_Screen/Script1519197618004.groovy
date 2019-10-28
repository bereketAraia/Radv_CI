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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ApplicationURL)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_username'), GlobalVariable.mrrc2user50)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Invalid Confirmation'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_first coversheet_a_Contract-Level RADV'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/button_Validate'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/button_a_View Submission'))

WebUI.setText(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/input_attestationDateMM'), '04')

WebUI.setText(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/input_attestationDateDD'), '15')

WebUI.setText(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/input_attestationStartYYYY'), '2013')

WebUI.setText(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/input_attestationDateDD'), '4')

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/Title_h3_Enter date of service found '), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/small_Error Invalid date enter'), 3)

WebUI.setText(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/input_attestationDateDD'), '04')

WebUI.setText(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/input_attestationDateMM'), 'kk')

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/Title_h3_Enter date of service found '))

WebUI.verifyElementPresent(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/small_Error Invalid date enter'), 2)

WebUI.setText(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/input_attestationDateMM'), '02')

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/h3_Enter date of service found'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/label_Attestation Date'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/label_No Attestation'))

WebUI.click(findTestObject('INTAKE_Invalid_Confirmation_Page_RADV/label_A CMS-Generated Attestat (1)'))

WebUI.closeBrowser()

