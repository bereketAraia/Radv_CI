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

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_username'), GlobalVariable.mrrc2user51)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Invalid Confirmation'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_first coversheet_a_Contract-Level RADV'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Detail_page/button_Validate'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Detail_page/a_View Submission'))

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_4/h3_Enter date of service found'), 'Enter date of service found on the medical record.')

WebUI.getText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_4/input_medicalRecordStartDD'))

WebUI.getText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_4/input_medicalRecordStartMM'))

WebUI.getText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_4/input_medicalRecordStartYYYY'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_4/input_medicalRecordStartDD'), '12')

WebUI.sendKeys(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_4/input_medicalRecordStartMM'), '24')

WebUI.sendKeys(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_4/input_medicalRecordStartYYYY'), '2014')

WebUI.delay(2)

WebUI.setText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_4/input_medicalRecordStartDD'), '3')

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_4/h3_Enter date of service found'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_4/Err_Msg_Section4_Error Invalid date entered. Date must be'), 
    'Error: Invalid date entered. Date must be in MM/DD/YYYY format.')

