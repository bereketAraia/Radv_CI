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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ApplicationURL)

WebUI.waitForPageLoad(2)

for (def index : (0..5)) {
    user = index.toString()

    userName = ('plan-user5' + user)

    WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), userName)

    WebUI.delay(2)

    WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_plan_QA)

    WebUI.delay(2)

    WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

    WebUI.delay(3)

    WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

    WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2013 Contract-Level'))

    WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_I accept.'))

    WebUI.delay(3)

    WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Contract_first_a_- Contract'))

    WebUI.delay(2)

    Random rnd = new Random()

    randomNumber = (rnd.nextInt(9) + 1)

    println(randomNumber)

    if (randomNumber == 1) {
        WebUI.delay(2)

        WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_1'))

        WebUI.delay(2)
    } else if (randomNumber == 2) {
        WebUI.delay(2)

        WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_2'))

        WebUI.delay(2)
    } else if (randomNumber == 3) {
        WebUI.delay(2)

        WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_3'))

        WebUI.delay(2)
    } else if (randomNumber == 4) {
        WebUI.delay(2)

        WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_4'))

        WebUI.delay(2)
    } else if (randomNumber == 5) {
        WebUI.delay(2)

        WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_5'))

        WebUI.delay(2)
    } else if (randomNumber == 6) {
        WebUI.delay(2)

        WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_6'))

        WebUI.delay(2)
    } else if (randomNumber == 7) {
        WebUI.delay(2)

        WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_7'))

        WebUI.delay(2)
    } else if (randomNumber == 8) {
        WebUI.delay(2)

        WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_8'))

        WebUI.delay(2)
    } else if (randomNumber == 9) {
        WebUI.delay(2)

        WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_9'))

        WebUI.delay(2)
    } else if (randomNumber == 10) {
        WebUI.delay(2)

        WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_10'))

        WebUI.delay(2)
    }
    
    WebUI.mouseOver(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/bottom_div_Add Coversheet'))

    WebUI.delay(2)

    WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/bottom_a_Single'))

    //WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Tab_a_Guided Form'))
    WebUI.delay(2)

    WebUI.scrollToPosition(0, 500)

    WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/button_Medical Record'))

    //WebUI.scrollToElement(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/label_Choose a file or drag it'), 2)
    WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/label_Choose a file or drag it'))

    WebUI.delay(2)

    Runtime.getRuntime().exec(GlobalVariable.autoIT_chrome)

    WebUI.delay(2)

    WebUI.scrollToPosition(0, 1000)

    randomMonth = (rnd.nextInt(11) + 1)

    if (randomMonth < 10) {
        randomMonth = ('0' + randomMonth.toString())
    } else {
        randomMonth = randomMonth.toString()
    }
    
    randomDay = (rnd.nextInt(27) + 1)

    if (randomDay < 10) {
        randomDay = ('0' + randomDay.toString())
    } else {
        randomDay = randomDay.toString()
    }
    
    print(randomMonth)

    /*

    WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientVisitationM'))

    WebUI.setText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientVisitationM'), randomMonth)

    WebUI.delay(2)

    //WebUI.scrollToElement(findTestObject('Old_Objects/PORTAL_P5_Medical_Record_Coversheet_Page/Date_OutPatient_dates'), 2)
    WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientVisitationD'))

    WebUI.setText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientVisitationD'), randomDay)

    WebUI.delay(2)

    WebUI.scrollToPosition(0, 1900)

    WebUI.delay(3)
	*/
    WebUI.sendKeys(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientVisitation'), '12-19-2014')

    WebUI.scrollToPosition(0, 1900)

    WebUI.delay(3)

    WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/HCC_Tab1_label_HCC0000 (Part of a hierarchy)'))

    WebUI.delay(2)

    WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/HCC_Tab2_label_HCC131136 (Part of a hie'))

    WebUI.delay(1)

    'review page reached'
    WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/button_Review'))

    WebUI.delay(5)

    WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/button_Submit'))

    WebUI.delay(7)

    WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/PopUp_button_Yes'))

    WebUI.delay(3)

    WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Header_a_Log Out'))

    WebUI.delay(3)

    header = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/h1_PageTitle'))

    if (header == 'Enrollee Submission Management') {
        WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Header_a_Log Out'))

        WebUI.delay(5)
    }
}

