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

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/Text_h1_Focused Review'), 'Focused Review')

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/Text_li_Coversheet ID CY YYYY'), 
    0)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/Text_li_CHIC xxxxxxxxxaa'), 0)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/Text_li_RRBHIC 0000000000'), 0)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/button_Submission Review'), 0)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/button_Details'), 0)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/button_Code MR'), 0)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/Text_li_Enrollee ID 000000'), 
    0)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/Text_li_Name Last First'), 0)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/Text_li_DOB 00000000'), 0)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/Text_li_Provider Type'), 0)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/Text_li_Date of Service Start'), 
    0)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P5_Focused_Review_Page/Focused_details_Tab/Text_li_Date of Service End'), 
    0)

