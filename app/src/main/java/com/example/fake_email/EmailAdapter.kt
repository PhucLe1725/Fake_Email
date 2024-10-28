package com.example.fake_email

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emailList: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val avatarTextView: TextView = itemView.findViewById(R.id.avatarTextView)
        val senderTextView: TextView = itemView.findViewById(R.id.senderTextView)
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val previewTextView: TextView = itemView.findViewById(R.id.previewTextView)
        val timeTextView: TextView = itemView.findViewById(R.id.timeTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.avatarTextView.text = email.avatar
        holder.senderTextView.text = email.sender
        holder.titleTextView.text = email.title
        holder.previewTextView.text = email.preview
        holder.timeTextView.text = email.time
    }

    override fun getItemCount() = emailList.size
}
