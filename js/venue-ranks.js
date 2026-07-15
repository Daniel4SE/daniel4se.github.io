(function () {
  var rules = [
    [/TOSEM/, [['CCF-A Journal', 'ccf-a'], ['CORE2020 A*', 'core-a-star core-top'], ['Top SE Journal', 'top']]],
    [/EMSE/, [['CCF-B Journal', 'ccf-b'], ['CORE2020 A', 'core-a core-top'], ['Top SE Journal', 'top']]],
    [/ACM HEALTH/, [['CORE N/A', 'core-na'], ['Top Healthcare Journal', 'top']]],
    [/FSE.*(Poster|IVR)/, [['CCF-A Main Venue', 'ccf-a'], ['ICORE2026 A* Main Venue', 'core-a-star core-top'], ['Special Track', '']]],
    [/FSE/, [['CCF-A', 'ccf-a'], ['ICORE2026 A*', 'core-a-star core-top'], ['Top SE Conference', 'top']]],
    [/ICSE.*Poster/, [['CCF-A Main Venue', 'ccf-a'], ['ICORE2026 A* Main Venue', 'core-a-star core-top'], ['Poster Track', '']]],
    [/ICSE.*SEIP/, [['CCF-A Main Venue', 'ccf-a'], ['ICORE2026 A* Main Venue', 'core-a-star core-top'], ['SEIP Track', '']]],
    [/ICSE/, [['CCF-A', 'ccf-a'], ['ICORE2026 A*', 'core-a-star core-top'], ['Top SE Conference', 'top']]],
    [/EASE/, [['CCF-C', 'ccf-c'], ['ICORE2026 A', 'core-a core-top']]],
    [/ASE.*NIER/, [['CCF-A Main Venue', 'ccf-a'], ['ICORE2026 A* Main Venue', 'core-a-star core-top'], ['NIER Track', '']]],
    [/ASE/, [['CCF-A', 'ccf-a'], ['ICORE2026 A*', 'core-a-star core-top'], ['Top SE Conference', 'top']]],
    [/NAACL/, [['CCF-B', 'ccf-b'], ['ICORE2026 A', 'core-a core-top'], ['Leading NLP Conference', '']]],
    [/EMNLP/, [['CCF-B', 'ccf-b'], ['ICORE2026 A*', 'core-a-star core-top'], ['Top NLP Conference', 'top']]],
    [/ACL.*(Findings|Short)/, [['CCF-A Main Venue', 'ccf-a'], ['ICORE2026 A* Main Venue', 'core-a-star core-top'], ['Special Track', '']]],
    [/ACL/, [['CCF-A', 'ccf-a'], ['ICORE2026 A*', 'core-a-star core-top'], ['Top NLP Conference', 'top']]],
    [/ICML/, [['CCF-A', 'ccf-a'], ['ICORE2026 A*', 'core-a-star core-top'], ['Top ML Conference', 'top']]],
    [/ICLR.*Tiny/, [['CCF-A Main Venue', 'ccf-a'], ['ICORE2026 A* Main Venue', 'core-a-star core-top'], ['Tiny Papers', '']]],
    [/ICLR/, [['CCF-A', 'ccf-a'], ['ICORE2026 A*', 'core-a-star core-top'], ['Top ML Conference', 'top']]],
    [/AAAI.*W3PHIAI/, [['CCF-A Main Venue', 'ccf-a'], ['ICORE2026 A* Main Venue', 'core-a-star core-top'], ['Workshop', '']]],
    [/AAAI/, [['CCF-A', 'ccf-a'], ['ICORE2026 A*', 'core-a-star core-top'], ['Top AI Conference', 'top']]],
    [/ACM MM/, [['CCF-A', 'ccf-a'], ['ICORE2026 A*', 'core-a-star core-top'], ['Top Multimedia Conference', 'top']]],
    [/ICSME/, [['CCF-B Main Venue', 'ccf-b'], ['ICORE2026 A Main Venue', 'core-a core-top'], ['NIER Track', '']]],
    [/DASFAA.*Workshop/, [['CCF-B Main Venue', 'ccf-b'], ['ICORE2026 B Main Venue', 'core-b'], ['Workshop', '']]],
    [/DASFAA/, [['CCF-B', 'ccf-b'], ['ICORE2026 B', 'core-b']]],
    [/ICPR/, [['CCF-C', 'ccf-c'], ['ICORE2026 B', 'core-b']]],
    [/ICONIP/, [['CCF-C', 'ccf-c'], ['ICORE2026 B', 'core-b']]],
    [/Neurocomputing/, [['CCF-C Journal', 'ccf-c'], ['CORE2020 B', 'core-b']]],
    [/IEEE Access/, [['CCF Unlisted', ''], ['CORE Unlisted', 'core-na']]],
    [/arXiv/, [['Preprint', ''], ['CORE N/A', 'core-na']]]
  ];

  document.querySelectorAll('.pub-venue').forEach(function (venue) {
    var name = venue.textContent.trim();
    var match = rules.find(function (rule) { return rule[0].test(name); });
    if (!match) return;

    var tags = document.createElement('span');
    tags.className = 'venue-tags';
    match[1].forEach(function (item) {
      var tag = document.createElement('span');
      tag.className = 'venue-rank ' + item[1];
      tag.textContent = item[0];
      tags.appendChild(tag);
    });
    venue.appendChild(tags);
  });
})();
