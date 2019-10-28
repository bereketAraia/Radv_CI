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

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Focused Review'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_first coversheet_a_Contract-Level RADV'))

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Title_h1_Focused Review'), 'Focused Review')

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/Text_li_CHIC xxxxxxxxxaa'), 0)

'Passed 975.1'
WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/Text_li_RRBHIC 0000000000'), 0)

WebUI.click(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/button_Code MR'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/Button_a_View Submission'))

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_codeMR/button_Exit'), 0)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_codeMR/button_Escalate'), 0)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_codeMR/button_Saving_Save'), 0)

'Passed 975.2'
WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_codeMR/button_Complete'), 0)

WebUI.scrollToElement(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_codeMR/Text_h2_Found CMS-HCCs in this submission'), 
    2)

'975.7'
WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_codeMR/Radio_No ICD-9 codes found in this submission'), 
    0)

WebUI.click(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_codeMR/Radio_No ICD-9 codes found in this submission'))

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_codeMR/CommentBox- Ni ICD-9 radio'), 0)

WebUI.click(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_codeMR/Radio_No ICD-9 codes found in this submission'))

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_codeMR/ErrMsgsmall_You have indicated that'), 
    'You have indicated that there are no ICD-9 codes for this record. If this is true, select "No ICD-9 codes found in the submission" otherwise enter ICD-9 codes.')

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_codeMR/label_Provide any general comm'), 'Provide any general comments you may have about this submission. (Optional)')

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_codeMR/CommentBox_textarea_generalComments'), 
    2)

