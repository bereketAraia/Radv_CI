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

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/filter_button_Focused Review'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'))

WebUI.verifyElementClickable(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/button_Details'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Hero_Section/hero_button_Code MR'))

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Hero_Section/hero_a_View Submission'))

WebUI.scrollToPosition(0, 1200)

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_label_No ICD-9 codes found in this submission'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_textarea_noICDsComment'))

WebUI.setText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_textarea_noICDsComment'), 
    'hello Radv Focused')

'1002.1'
WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Footer_Section/button_Complete'))

WebUI.delay(2)

'1002.2'
WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Footer_Section/Complete-Text_p_Are you sure you want to submit'), 
    'Are you sure you want to submit? This task cannot be recalled once it has been submitted.')

'1002.3'
WebUI.verifyElementClickable(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Footer_Section/Complete_button_CompleteSection'))

'1002.3'
WebUI.verifyElementClickable(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Footer_Section/ContinueWorking_button_CompleteSection'))

'1002.5'
WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Footer_Section/ContinueWorking_button_CompleteSection'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_label_No ICD-9 codes found in this submission'))

'1002.6'
WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_ERROR_small_You have indicated that'), 
    'You have indicated that there are no ICD-9 codes for this record. If this is true, select "No ICD-9 codes found in the submission" otherwise enter ICD-9 codes.')

