package tat.mukhutdinov.instabugsamle

import com.instabug.bug.BugReporting

class Main {

    fun foo(){
        val configurations = ProactiveReportingConfigurations.Builder()
            .isEnabled(true) //Enable/disable
            .setGapBetweenModals(24) // Time in seconds
            .setModalDelayAfterDetection(30) // Time in seconds
            .build()

        BugReporting.setProactiveReportingConfigurations(configurations)
    }
}