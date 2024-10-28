package com.example.fake_email

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailList = listOf(
            Email(
                "Edurila.com",
                "19$ Only (First 10 spots)",
                "Are you looking to learn web designing...",
                "12:34 PM",
                "E"
            ),
            Email(
                "Chris Abad",
                "Help make Campaign Monitor better",
                "Let us know your thoughts! No Images...",
                "11:22 AM",
                "C"
            ),
            Email(
                "Tuto.com",
                "Free training on new tools",
                "Photoshop, SEO, Blender, CSS, WordPress...",
                "11:04 AM",
                "T"
            ),
            Email(
                "Support",
                "Service Updates",
                "Société Ovh : suivi de vos services...",
                "10:26 AM",
                "S"
            ),
            Email(
                "Matt from Ionic",
                "The New Ionic Creator Is Here!",
                "Announcing the all-new Creator, build...",
                "9:45 AM",
                "M"
            ),
            Email(
                "John Doe",
                "Your invoice is ready",
                "You can download your invoice from the link...",
                "8:30 AM",
                "J"
            ),
            Email(
                "Jane Smith",
                "Meeting Reminder",
                "Don't forget our meeting scheduled for tomorrow...",
                "7:45 AM",
                "J"
            ),
            Email(
                "Marketing Team",
                "New Products Launch",
                "Check out our latest products launched this week...",
                "6:15 AM",
                "M"
            ),
            Email(
                "Newsletter",
                "Weekly Updates",
                "Here are your weekly updates and news...",
                "5:00 AM",
                "N"
            ),
            Email(
                "Tech Support",
                "Password Reset",
                "Click here to reset your password...",
                "4:00 AM",
                "T"
            ),
            Email(
                "Shop Now",
                "Exclusive Discounts Just for You",
                "Get 30% off on your next purchase...",
                "3:00 AM",
                "S"
            ),
            Email(
                "Weekly Digest",
                "Top Articles This Week",
                "Read the most popular articles of the week...",
                "2:00 AM",
                "W"
            ),
            Email(
                "Feedback Request",
                "We Value Your Opinion",
                "Please take a moment to provide feedback on your experience...",
                "1:00 AM",
                "F"
            ),
            Email(
                "Travel Deals",
                "Last Minute Offers",
                "Grab the best travel deals for this weekend...",
                "12:00 AM",
                "T"
            ),
            Email(
                "Event Reminder",
                "Upcoming Webinar",
                "Join us for an insightful webinar next week...",
                "11:00 PM",
                "E"
            ),
            Email(
                "Security Alert",
                "Unusual Login Activity",
                "We detected unusual login activity on your account...",
                "10:00 PM",
                "S"
            ),
            Email(
                "System Update",
                "New Features Available",
                "Check out the new features we've added to our system...",
                "9:00 PM",
                "S"
            ),
            Email(
                "Job Application",
                "Thank You for Your Application",
                "We appreciate your interest in the position...",
                "8:00 PM",
                "J"
            ),
            Email(
                "Invoice Reminder",
                "Payment Due Soon",
                "Your payment is due soon, please make arrangements...",
                "7:00 PM",
                "I"
            ),
            Email(
                "Customer Care",
                "We're Here to Help",
                "If you need assistance, please reach out to us...",
                "6:00 PM",
                "C"
            ),
            Email(
                "Admin",
                "Weekly Report",
                "Here is the weekly report of your activities...",
                "5:00 PM",
                "A"
            )
        )

        // Ánh xạ RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emailList)
    }
}