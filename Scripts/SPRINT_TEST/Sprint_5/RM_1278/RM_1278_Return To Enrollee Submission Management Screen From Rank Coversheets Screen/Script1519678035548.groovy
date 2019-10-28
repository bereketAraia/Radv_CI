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

WebUI.openBrowser(GlobalVariable.ApplicationURL)

WebUI.waitForPageLoad(2)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.planuser20)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_I accept.'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Contract_first_a_- Contract'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_1'))

WebUI.delay(2)

'RM-1278.1 change rank Clicked !!'
WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/bottom_a_Change Rank'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_li_Name'), 
    1)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_li_DOB'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_li_Enrollee ID'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_li_Current HMOID'), 
    1)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_li_Sample Year HMOID'), 
    1)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_li_MA Contract  Contract'), 
    1)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_li_MA Organization MA Organization'), 
    1)

'RM-1278.3 check for hero components\r\n'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_li_Submission Deadline'), 
    1)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Rank/rank_table_th_Rank'), 'RANK')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Rank/rank_table_th_Type'), 'TYPE')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Rank/rank_table_th_Coversheet ID'), 
    'COVERSHEET ID')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Rank/rank_table_th_Date Submitted'), 
    'DATE SUBMITTED')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Rank/rank_table_th_CMS-HCCs'), 
    'CMS-HCCS')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Rank/rank_table_th_Issue'), 'ISSUE')

'RM-1278.3 check table headers'
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Rank/rank_table_th_File Format Issue'), 
    'FILE FORMAT ISSUE')

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/footer_button_Cancel'), 
    1)

