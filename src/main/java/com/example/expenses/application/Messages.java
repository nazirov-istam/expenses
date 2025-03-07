package com.example.expenses.application;

import org.springframework.stereotype.Component;

@Component
public final class Messages {
    public static final String language = """
            \uD83C\uDDFA\uD83C\uDDFF Tilni tanlang !!!
            \uD83C\uDDF7\uD83C\uDDFA Выберите язык !!!
            \uD83C\uDDFA\uD83C\uDDF8 Select a language !!!
            """;
    public static final String Uz = "\uD83C\uDDFA\uD83C\uDDFF Uz";
    public static final String Ru = "\uD83C\uDDF7\uD83C\uDDFA Ru";
    public static final String En = "\uD83C\uDDFA\uD83C\uDDF8 En";

    public static final String welcomeMenuUz = "Siz 'Asosiy buyruqlar' bo'limidasiz.";
    public static final String welcomeMenuRu = "Вы находитесь в разделе 'Основные команды'.";
    public static final String welcomeMenuEn = "You are in the 'Main commands' section.";

    public static final String welcomeProfileUz = "Siz 'Profil' bo'limidasiz.";
    public static final String welcomeProfileRu = "Вы находитесь в разделе 'Профиль'.";
    public static final String welcomeProfileEn = "You are in the 'Profile' section.";

    public static final String welcomeEditProfileUz = "Siz 'Foydalanuvchi ma'lumotlarini o'zgartirish' bo'limidasiz.";
    public static final String welcomeEditProfileRu = "Вы находитесь в разделе 'Изменение данных пользователя'.";
    public static final String welcomeEditProfileEn = "You are in the 'Edit User Information' section.";

    public static final String getSuccessFirstNameEditUz = "Foydalanuvchi ismi yangilandi.";
    public static final String getSuccessFirstNameEditRu = "Имя пользователя обновлено.";
    public static final String getSuccessFirstNameEditEn = "User's first name has been updated.";

    public static final String getSuccessLastNameEditUz = "Foydalanuvchi familiyasi yangilandi.";
    public static final String getSuccessLastNameEditRu = "Фамилия пользователя обновлена.";
    public static final String getSuccessLastNameEditEn = "User's last name has been updated.";

    public static final String getSuccessPhoneNumberEditUz = "Foydalanuvchi telefon raqami yangilandi.";
    public static final String getSuccessPhoneNumberEditRu = "Номер телефона пользователя обновлен.";
    public static final String getSuccessPhoneNumberEditEn = "User's phone number has been updated.";


    public static final String startUz = """
            👋 Salom! My Expenses Manager Bot-ga xush kelibsiz!💰
            
            Bu bot yordamida xarajatlaringizni kuzatishingiz, byudjetingizni nazorat qilishingiz va moliyaviy maqsadlaringizga erishishingiz mumkin.
            
            📌 Asosiy buyruqlar:
            ✅ /main – Asosiy buyruqlar
            ✅ /info – Bot haqida ma'lumot olish
            ✅ /help – Yordam
            ✅ /language - Tilni o'zgartirish
            """;

    public static final String startRu = """
            👋 Привет! Добро пожаловать в My Expenses Manager Bot!💰
            
            С помощью этого бота вы можете отслеживать свои расходы, контролировать бюджет и достигать финансовых целей.
            
            📌 Основные команды:
            ✅ /main – Основные команды
            ✅ /info – Получить информацию о боте
            ✅ /help – Помощь
            ✅ /language - Изменить язык
            """;

    public static final String startEn = """
            👋 Hello! Welcome to My Expenses Manager Bot!💰
            
            With this bot, you can track your expenses, manage your budget, and achieve your financial goals.
            
            📌 Main commands:
            ✅ /main – Main commands
            ✅ /info – Get information about the bot
            ✅ /help – Help
            ✅ /language - Change language
            """;


    public static final String startUzIsRegistered = """
            Siz allaqachon ro‘yxatdan o‘tgansiz. 📌
            """;

    public static final String startRuIsRegistered = """
            Вы уже зарегистрированы. 📌
            """;

    public static final String startEnIsRegistered = """
            You are already registered. 📌
            """;


    public static final String helpUz = """
            🆘 Yordam kerakmi?
            
            Agar botdan foydalanishda savollaringiz bo‘lsa yoki texnik muammolar yuzaga kelsa, biz bilan bog‘lanishingiz mumkin.
            
            📩 Biz bilan bog‘lanish:
            👉 Telegram: @nazirov_istam
            
            📢 Eslatma:
            Savollarga javob berish vaqti: 09:00 - 18:00 (Toshkent vaqti).
            Xarajatlarni boshqarish bo‘yicha savollaringizga tezkor va to‘liq javob berishga harakat qilamiz!
            
            🌟 Omad tilaymiz va sizning murojaatingizni kutamiz! 💰
            """;

    public static final String helpRu = """
            🆘 Нужна помощь?
            
            Если у вас есть вопросы по использованию бота или возникли технические проблемы, вы можете связаться с нами.
            
            📩 Связаться с нами:
            👉 Telegram: @nazirov_istam
            
            📢 Напоминание:
            Время ответа на вопросы: 09:00 - 18:00 (по ташкентскому времени).
            Мы постараемся быстро и полно ответить на ваши вопросы по управлению расходами!
            
            🌟 Желаем удачи и ждем вашего обращения! 💰
            """;

    public static final String helpEn = """
            🆘 Need help?
            
            If you have any questions about using the bot or encounter technical issues, you can contact us.
            
            📩 Contact us:
            👉 Telegram: @nazirov_istam
            
            📢 Note:
            Response time for questions: 09:00 - 18:00 (Tashkent time).
            We will do our best to provide quick and complete answers to your expense management questions!
            
            🌟 Good luck, and we look forward to assisting you! 💰
            """;


    public static final String infoUz = """
            ℹ️ My Expenses Manager Bot
            
            @my_expenses_manager_bot – bu shaxsiy moliyangizni boshqarish uchun qulay bot.
            Siz xarajatlaringizni qo‘shish, kuzatish va tahlil qilish orqali pulingizni samarali boshqarishingiz mumkin.
            
            📌 Asosiy xususiyatlar:
            ✔️ Xarajatlarni qo‘shish va kategoriyalar bo‘yicha ajratish
            ✔️ Oylik budjetni belgilash va nazorat qilish
            ✔️ Xarajatlar statistikasini ko‘rish
            
            🆘 Yordam uchun: /help
            📊 Statistika: /stats
            
            📢 Moliyangizni nazorat qiling va ko‘proq jamg‘aring! 🚀
            """;

    public static final String infoRu = """
            ℹ️ My Expenses Manager Bot
            
            @my_expenses_manager_bot – удобный бот для управления вашими личными финансами.
            Вы можете добавлять, отслеживать и анализировать свои расходы, чтобы эффективно управлять своими деньгами.
            
            📌 Основные функции:
            ✔️ Добавление расходов и их категоризация
            ✔️ Установка и контроль месячного бюджета
            ✔️ Просмотр статистики расходов
            
            🆘 Помощь: /help
            📊 Статистика: /stats
            
            📢 Контролируйте свои финансы и экономьте больше! 🚀
            """;

    public static final String infoEn = """
            ℹ️ My Expenses Manager Bot
            
            @my_expenses_manager_bot – a convenient bot for managing your personal finances.
            You can add, track, and analyze your expenses to manage your money efficiently.
            
            📌 Key features:
            ✔️ Add expenses and categorize them
            ✔️ Set and control a monthly budget
            ✔️ View expense statistics
            
            🆘 Help: /help
            📊 Statistics: /stats
            
            📢 Take control of your finances and save more! 🚀
            """;

    // Profil
    public static final String menuProfileUz = "Profil" + " \uD83D\uDC64";
    public static final String menuProfileRu = "Профиль" + " \uD83D\uDC64";
    public static final String menuProfileEn = "Profile" + " \uD83D\uDC64";

    public static final String backUz = "Orqaga" + " ⬅️";
    public static final String backRu = "Назад" + " ⬅️";
    public static final String backEn = "Back" + " ⬅️";


    public static final String menuProfileViewUz = "Foydalanuvchi ma'lumotlari" + " \uD83D\uDC64";
    public static final String menuProfileViewRu = "Информация о пользователе" + " \uD83D\uDC64";
    public static final String menuProfileViewEn = "User Information" + " \uD83D\uDC64";

    public static final String menuProfileEditUz = "Foydalanuvchi ma'lumotlarini o'zgartirish" + " ⚙️";
    public static final String menuProfileEditRu = "Изменить информацию о пользователе" + " ⚙️";
    public static final String menuProfileEditEn = "Edit User Information" + " ⚙️";


    // Daromad
    public static final String menuIncomeUz = "Daromad" + " \uD83D\uDCB5";
    public static final String menuIncomeRu = "Доход" + " \uD83D\uDCB5";
    public static final String menuIncomeEn = "Income" + " \uD83D\uDCB5";

    // Xarajat
    public static final String menuExpenseUz = "Xarajat" + " \uD83D\uDED2";
    public static final String menuExpenseRu = "Расход" + " \uD83D\uDED2";
    public static final String menuExpenseEn = "Expense" + " \uD83D\uDED2";

    // Hisobot
    public static final String menuReportUz = "Hisobot" + " \uD83D\uDCC1";
    public static final String menuReportRu = "Отчёт" + " \uD83D\uDCC1";
    public static final String menuReportEn = "Report" + " \uD83D\uDCC1";

    // User ma'lumotlarini surash
    public static final String askFirstNameUz = """
            \uD83D\uDCCB Iltimos, ismingizni kiriting:
            Namuna: Sardor
            """;
    public static final String askLastNameUz = """
            \uD83D\uDCCB Iltimos, familiyangizni kiriting:
            Namuna: Sardorov
            """;
    public static final String askCurrentIncomeUz = """
            \uD83D\uDCB5 Iltimos, hozirgi daromat miqdoringizni kiriting:
            Namuna: 10000000
            """;

    public static final String askFirstNameRu = """
            \uD83D\uDCCB Пожалуйста, введите ваше имя:
            Пример: Сардор
            """;
    public static final String askLastNameRu = """
            \uD83D\uDCCB Пожалуйста, введите вашу фамилию:
            Пример: Сардоров
            """;
    public static final String askCurrentIncomeRu = """
            \uD83D\uDCB5 Пожалуйста, введите ваш текущий доход:
            Пример: 10000000
            """;

    public static final String askFirstNameEn = """
            \uD83D\uDCCB Please enter your first name:
            Example: Sardor
            """;
    public static final String askLastNameEn = """
            \uD83D\uDCCB Please enter your last name:
            Example: Sardorov
            """;
    public static final String askCurrentIncomeEn = """
            \uD83D\uDCB5 Please enter your current income amount:
            Example: 10000000
            """;

    public static final String successSaveProfileInfoUz = "Shaxsiy ma'lumotlaringiz muvaffaqiyatli saqlandi. \nUlarni 'Profil' bo'limidan ko'rishingiz va o'zgartirishingiz mumkin.";
    public static final String successSaveProfileInfoRu = "Ваши личные данные успешно сохранены. \nВы можете просмотреть и изменить их в разделе 'Профиль'.";
    public static final String successSaveProfileInfoEn = "Your personal information has been successfully saved. \nYou can view and edit it in the 'Profile' section.";

    public static final String editFirstNameButtonUz = "Ismni o'zgartirish ✏️";
    public static final String editFirstNameButtonRu = "Изменить имя ✏️";
    public static final String editFirstNameButtonEn = "Edit First Name ✏️";

    public static final String editLastNameButtonUz = "Familiyani o'zgartirish ✏️";
    public static final String editLastNameButtonRu = "Изменить фамилию ✏️";
    public static final String editLastNameButtonEn = "Edit Last Name ✏️";

    public static final String editPhoneNumberButtonUz = "Telefon raqamni o'zgartirish ✏️";
    public static final String editPhoneNumberButtonRu = "Изменить номер телефона ✏️";
    public static final String editPhoneNumberButtonEn = "Edit Phone Number ✏️";

    public static final String askNewFirstNameUz = "Iltimos, yangi ismni yozing:";
    public static final String askNewFirstNameRu = "Пожалуйста, введите новое имя:";
    public static final String askNewFirstNameEn = "Please enter a new first name:";

    public static final String askNewLastNameUz = "Iltimos, yangi familiyangizni yozing:";
    public static final String askNewLastNameRu = "Пожалуйста, введите новую фамилию:";
    public static final String askNewLastNameEn = "Please enter a new surname:";

    public static final String askNewPhoneNumberUz = "Iltimos, yangi telefon raqamingizni yozing:";
    public static final String askNewPhoneNumberRu = "Пожалуйста, введите новый номер телефона:";
    public static final String askNewPhoneNumberEn = "Please enter a new phone number:";

    public static final String askExpenseSourceUz = "Iltimos, xarajat joyini kiriting:";
    public static final String askExpenseSourceRu = "Пожалуйста, введите место расхода:";
    public static final String askExpenseSourceEn = "Please enter the expense location:";

    public static final String askExpenseAmountUz = "Iltimos, xarajat miqdorini kiriting:";
    public static final String askExpenseAmountRu = "Пожалуйста, введите сумму расхода:";
    public static final String askExpenseAmountEn = "Please enter the expense amount:";

    public static final String askExpenseDescriptionUz = "Iltimos, xarajat uchun izoh kiriting:";
    public static final String askExpenseDescriptionRu = "Пожалуйста, введите примечание к расходу:";
    public static final String askExpenseDescriptionEn = "Please enter a note for the expense:";


}
