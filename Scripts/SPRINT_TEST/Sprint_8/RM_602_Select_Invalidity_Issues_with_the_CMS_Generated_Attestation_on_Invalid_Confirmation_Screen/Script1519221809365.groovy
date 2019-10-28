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

WebUI.scrollToElement(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/h3_Select all relevant issues'), 2)

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/h3_Select all relevant issues'), 'Select all relevant issues with the CMS-generated attestation.')

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/h4_Are there any issues with t'), 'Are there any issues with the CMS-generated Attestation?')

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_No'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_Yes'))

'varify the "NO" radio button is clickable'
WebUI.verifyElementClickable(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_No'))

'varify the "YES" radio button is clickable'
WebUI.verifyElementClickable(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_Yes'))

'varify the "Attestation Altered" radio button is clickable'
WebUI.verifyElementClickable(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_Attestation altered'))

'varify the "Attestation Incomplete" radio button is clickable'
WebUI.verifyElementClickable(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_Attestation incomplete'))

'varify the Date of service Mismatch radio button is clickable'
WebUI.verifyElementClickable(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_Date of service mismatch'))

'varify the YES radio button is clickable'
WebUI.verifyElementClickable(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_Incorrect enrollee'))

'varify the YES radio button is clickable'
WebUI.verifyElementClickable(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_Inpatient record'))

'varify the YES radio button is clickable'
WebUI.verifyElementClickable(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_Other'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_Attestation incomplete'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_Date of service mismatch'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_Incorrect enrollee'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_Inpatient record'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_Other'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/CommentBox_textarea_relevantComments'))

//WebUI.setText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/CommentBox_textarea_relevantComments'), GlobalVariable.over_2000_char)
WebUI.clearText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/CommentBox_textarea_relevantComments'))

WebUI.setText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/CommentBox_textarea_relevantComments'), 'Hello Radv People')

