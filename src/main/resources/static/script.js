const API_BASE = "http://localhost:8080/api";

async function getQuestion() {
    const res = await fetch(`${API_BASE}/question`);
    const data = await res.json();

    document.getElementById("question").innerText = data.question;
    document.getElementById("feedback").innerText = "";
}

async function submitAnswer() {
    const answer = document.getElementById("answerInput").value;

    const res = await fetch(`${API_BASE}/answer?answer=${encodeURIComponent(answer)}`, {
        method: "POST"
    });

    const text = await res.text();

    document.getElementById("feedback").innerText = text;
}