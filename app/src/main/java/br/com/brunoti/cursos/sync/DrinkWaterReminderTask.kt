package br.com.brunoti.cursos.sync

import android.content.Context
import br.com.brunoti.cursos.utils.PreferencesUtils
import br.com.brunoti.cursos.utils.clearAllNotifications
import br.com.brunoti.cursos.utils.remindUserBecauseCharging

class DrinkWaterReminderTask {
    companion object {
        const val ACTION_INCREMENT_WATER_COUNT = "action_increment_water_count"
        const val ACTION_CHARGING_REMINDER = "action_charging_reminder"
        const val ACTION_STRETCHING_REMINDER = "action_stretching_reminder"


        fun incrementChargingReminder(context: Context) {
            PreferencesUtils.incrementChargingReminderCount(context)
            remindUserBecauseCharging(context)
        }

        private fun incrementWaterCount(context: Context) {
            PreferencesUtils.incrementWaterCount(context)
            clearAllNotifications(context)
        }

        private fun incrementStretchingReminder(context: Context) {
            PreferencesUtils.incrementStretchingReminderCount(context)
        }


        fun executeTask(context: Context, action: String?) {
            when (action) {
                ACTION_INCREMENT_WATER_COUNT -> {
                    incrementWaterCount(context)
                }
                ACTION_CHARGING_REMINDER -> {
                    incrementChargingReminder(context)
                }
                ACTION_STRETCHING_REMINDER -> {
                    incrementStretchingReminder(context)
                }
            }
        }
    }
}


