const folderStructure = {
  "day1": ["Q1.java", "Q2.java"],
  "day2": ["Q1.java", "Q2.java"]
};

const accordion = document.getElementById("javaAccordion");

let i = 0;
for (const [folder, files] of Object.entries(folderStructure)) {
  const collapseId = `collapse${i}`;
  const headingId = `heading${i}`;

  const item = document.createElement("div");
  item.className = "accordion-item mb-2";

  item.innerHTML = `
    <h2 class="accordion-header" id="${headingId}">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#${collapseId}" aria-expanded="false" aria-controls="${collapseId}">
        📂 ${folder}
      </button>
    </h2>
    <div id="${collapseId}" class="accordion-collapse collapse" aria-labelledby="${headingId}" data-bs-parent="#javaAccordion">
      <div class="accordion-body" id="body-${i}">
        Loading files...
      </div>
    </div>
  `;
  accordion.appendChild(item);

  // Fetch files when accordion is opened
  const button = item.querySelector('.accordion-button');
  button.addEventListener('click', () => loadFiles(folder, files, `body-${i}`));

  i++;
}

function loadFiles(folder, files, containerId) {
  const container = document.getElementById(containerId);
  container.innerHTML = "";

  files.forEach(filename => {
    const path = `java/${folder}/${filename}`;
    fetch(path)
      .then(res => res.ok ? res.text() : Promise.reject("File not found"))
      .then(content => {
        const pre = document.createElement("pre");
        pre.className = "bg-light p-3 rounded border mb-3";
        pre.textContent = `// ${filename}\n\n${content}`;
        container.appendChild(pre);
      })
      .catch(err => {
        container.innerHTML += `<div class="text-danger">❌ ${filename} - ${err}</div>`;
      });
  });
}
